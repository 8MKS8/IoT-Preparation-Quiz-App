package com.quizapp.data

import com.quizapp.model.Question
import com.quizapp.model.Quiz

object QuizRepository {

    /**
     * ─────────────────────────────────────────────────────────────────
     *  HOW TO ADD A NEW QUIZ
     *  1. Create a new val like `val myQuiz = Quiz(...)`
     *  2. Add it to the `allQuizzes` list at the bottom of this file.
     *  3. That's it — it will appear automatically on the home screen.
     * ─────────────────────────────────────────────────────────────────
     */

    // ── QUIZ 1: Distributed Systems ──────────────────────────────────
    private val distributedSystemsQuiz = Quiz(
        id = "distributed_systems_week2",
        title = "Distributed Systems",
        description = "Week 2 – Introduction to Distributed Systems",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is a distributed system?",
                options = listOf(
                    "A single powerful computer handling all tasks",
                    "A collection of independent computers that appear as one coherent system",
                    "A system where all nodes share the same memory",
                    "A centralized server managing all client requests"
                ),
                correctAnswerIndex = 1,
                explanation = "A distributed system is a collection of independent computers (nodes) that appear to users as a single coherent system. Nodes communicate and coordinate via a network."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is an ADVANTAGE of distributed systems?",
                options = listOf(
                    "Simpler security model",
                    "Easier database management",
                    "Failure of one node does not bring down the entire system",
                    "No risk of data loss across nodes"
                ),
                correctAnswerIndex = 2,
                explanation = "Fault tolerance is a key advantage: if one node fails, other nodes can still communicate and operate, keeping the system running."
            ),
            Question(
                id = 3,
                questionText = "Which is a LIMITATION of distributed systems?",
                options = listOf(
                    "Nodes cannot share resources",
                    "It is difficult to provide adequate security across all nodes and connections",
                    "The system cannot be scaled",
                    "Each node must have its own dedicated printer"
                ),
                correctAnswerIndex = 1,
                explanation = "Security is a major challenge in distributed systems because both the nodes AND the connections between them must be secured, increasing the attack surface."
            ),
            Question(
                id = 4,
                questionText = "What does the CAP Theorem state?",
                options = listOf(
                    "A distributed system can achieve Consistency, Availability, and Partition Tolerance all at once",
                    "A distributed system cannot simultaneously guarantee all three: Consistency, Availability, and Partition Tolerance",
                    "Consistency is always sacrificed in distributed systems",
                    "Partition Tolerance is optional in modern systems"
                ),
                correctAnswerIndex = 1,
                explanation = "The CAP Theorem states that a distributed system can only guarantee two of the three: Consistency, Availability, and Partition Tolerance simultaneously."
            ),
            Question(
                id = 5,
                questionText = "Which are the key components of a distributed system?",
                options = listOf(
                    "CPU, RAM, ROM, and GPU",
                    "Load balancers, routers, modems, and switches",
                    "Clients, servers, nodes, and middleware",
                    "Databases, APIs, web servers, and firewalls"
                ),
                correctAnswerIndex = 2,
                explanation = "The key components of a distributed system include clients, servers, nodes, and middleware. Middleware allows different parts of the system to communicate."
            ),
            Question(
                id = 6,
                questionText = "How does Apache Kafka achieve fault tolerance?",
                options = listOf(
                    "Stateless computation only",
                    "Single-point-of-failure architecture",
                    "Centralized logging and caching",
                    "Data replication and failover"
                ),
                correctAnswerIndex = 3,
                explanation = "Apache Kafka achieves fault tolerance through data replication and failover — key techniques that ensure the system remains operational even when individual nodes fail."
            ),
            Question(
                id = 7,
                questionText = "What are the two key components of Apache Hadoop?",
                options = listOf(
                    "Kafka and Zookeeper",
                    "HDFS and MapReduce",
                    "Bigtable and Spanner",
                    "DynamoDB and EC2"
                ),
                correctAnswerIndex = 1,
                explanation = "Apache Hadoop is built around HDFS (Hadoop Distributed File System) for distributed storage, and MapReduce for distributed data processing."
            ),
            Question(
                id = 8,
                questionText = "Blockchain is best described as:",
                options = listOf(
                    "A client-server file system",
                    "A centralized database with encryption",
                    "A distributed ledger with decentralization and consensus mechanisms",
                    "A peer-to-peer streaming service"
                ),
                correctAnswerIndex = 2,
                explanation = "Blockchain is a distributed ledger whose key features are decentralization (no central authority) and consensus (nodes agree on the state of the ledger)."
            ),
            Question(
                id = 9,
                questionText = "Which of the following is NOT a common distributed database covered in this module?",
                options = listOf(
                    "Google Bigtable",
                    "Amazon DynamoDB",
                    "Apache Cassandra",
                    "Microsoft SQL Server"
                ),
                correctAnswerIndex = 3,
                explanation = "Microsoft SQL Server is a traditional relational database. The distributed databases covered are Google Bigtable, Amazon DynamoDB, and Apache Cassandra."
            ),
            Question(
                id = 10,
                questionText = "What can happen when all nodes in a distributed system try to send data simultaneously?",
                options = listOf(
                    "Data encryption failure",
                    "Node isolation",
                    "Network overloading",
                    "Memory overflow on the master node"
                ),
                correctAnswerIndex = 2,
                explanation = "Network overloading (congestion) is a known limitation — when all nodes try to transmit data at the same time, it can overwhelm the network."
            ),
            Question(
                id = 11,
                questionText = "Which emerging trend moves computation closer to the data source?",
                options = listOf(
                    "Serverless Architecture",
                    "Microservices",
                    "Edge Computing",
                    "Containerization"
                ),
                correctAnswerIndex = 2,
                explanation = "Edge Computing moves processing closer to where data is generated, reducing latency and bandwidth usage compared to sending everything to a central cloud."
            ),
            Question(
                id = 12,
                questionText = "Google File System (GFS) is primarily known for which characteristics?",
                options = listOf(
                    "Low cost and minimal redundancy",
                    "Real-time analytics and low latency",
                    "Fault tolerance and scalability",
                    "Client-side encryption and access control"
                ),
                correctAnswerIndex = 2,
                explanation = "GFS was designed with fault tolerance and scalability as its core characteristics, enabling Google to store and process massive datasets reliably."
            ),
            Question(
                id = 13,
                questionText = "What does 'scalability' mean in the context of distributed systems?",
                options = listOf(
                    "The ability to run on a single server indefinitely",
                    "The ability to add more nodes to handle increased load without degrading performance",
                    "The ability to encrypt data across the network",
                    "The ability to reduce nodes when demand drops"
                ),
                correctAnswerIndex = 1,
                explanation = "Scalability refers to the ability to add more nodes as demand grows, allowing the system to handle increased load — one of the key advantages of distributed architectures."
            ),
            Question(
                id = 14,
                questionText = "Which of the following is a real-world use case for distributed systems?",
                options = listOf(
                    "A single-user desktop application",
                    "A standalone local database on one machine",
                    "Streaming services like Netflix and YouTube",
                    "A batch script running on one server"
                ),
                correctAnswerIndex = 2,
                explanation = "Streaming services such as Netflix and YouTube rely on distributed systems to deliver content at massive scale to millions of concurrent users globally."
            ),
            Question(
                id = 15,
                questionText = "In a peer-to-peer distributed system, how do nodes interact?",
                options = listOf(
                    "All communication passes through a central server",
                    "Nodes communicate directly with each other without a central authority",
                    "Only one node can send data at a time",
                    "Nodes are read-only and cannot initiate requests"
                ),
                correctAnswerIndex = 1,
                explanation = "In a peer-to-peer system, nodes communicate directly with each other without requiring a central server — every node can act as both client and server."
            )
        )
    )

    // ── QUIZ 2: Distributed Systems Architectures ────────────────────
    private val distributedArchitecturesQuiz = Quiz(
        id = "distributed_architectures_week3",
        title = "Distributed Architectures",
        description = "Week 3 – Distributed Systems Architectures",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is the defining characteristic of a distributed architecture?",
                options = listOf(
                    "All components run on a single powerful machine",
                    "Components in different locations work together as a unified system",
                    "All nodes share the same memory space",
                    "One central server controls all other nodes"
                ),
                correctAnswerIndex = 1,
                explanation = "A distributed architecture allows components in different locations to work together as a unified system."
            ),
            Question(
                id = 2,
                questionText = "In a client-server architecture, what is the role of the server?",
                options = listOf(
                    "It requests services from clients",
                    "It acts as both client and server simultaneously",
                    "It provides responses to client requests",
                    "It distributes tasks equally among all nodes"
                ),
                correctAnswerIndex = 2,
                explanation = "In client-server architecture, clients request services and servers provide responses."
            ),
            Question(
                id = 3,
                questionText = "Which of the following is a key characteristic of client-server architecture?",
                options = listOf(
                    "Decentralization",
                    "Self-organization",
                    "Centralized control at the server",
                    "Each node acts as both client and server"
                ),
                correctAnswerIndex = 2,
                explanation = "Client-server architecture features centralized control — a single point of control at the server."
            ),
            Question(
                id = 4,
                questionText = "What is a major LIMITATION of client-server architecture?",
                options = listOf(
                    "Too many points of control",
                    "Single point of failure at the server",
                    "Nodes cannot share resources",
                    "It cannot support web applications"
                ),
                correctAnswerIndex = 1,
                explanation = "A key limitation of client-server architecture is the single point of failure — if the server goes down, all clients lose access."
            ),
            Question(
                id = 5,
                questionText = "Which real-world system is a classic example of client-server architecture?",
                options = listOf(
                    "BitTorrent",
                    "Blockchain",
                    "Email systems",
                    "Netflix microservices"
                ),
                correctAnswerIndex = 2,
                explanation = "Email systems are a classic client-server example — email clients connect to email servers to send, receive, and manage messages."
            ),
            Question(
                id = 6,
                questionText = "How does Peer-to-Peer (P2P) architecture differ from client-server?",
                options = listOf(
                    "P2P has a central server managing all nodes",
                    "P2P decentralizes control so each node acts as both client and server",
                    "P2P only allows one-way communication between nodes",
                    "P2P requires middleware for all communications"
                ),
                correctAnswerIndex = 1,
                explanation = "P2P architecture decentralizes control — each node acts as both a client and a server, unlike the centralized client-server model."
            ),
            Question(
                id = 7,
                questionText = "Which of the following is a key characteristic of P2P architecture?",
                options = listOf(
                    "Centralized data management",
                    "Single point of failure",
                    "Self-organization",
                    "Strict request-response model"
                ),
                correctAnswerIndex = 2,
                explanation = "Self-organization is a key characteristic of P2P — nodes can join and leave the network without central coordination."
            ),
            Question(
                id = 8,
                questionText = "What is a BENEFIT of Peer-to-Peer architecture?",
                options = listOf(
                    "Simplified security management",
                    "Centralized control",
                    "Fault tolerance",
                    "Predictable performance"
                ),
                correctAnswerIndex = 2,
                explanation = "Fault tolerance is a key benefit of P2P — because there is no central server, the failure of one node does not bring down the system."
            ),
            Question(
                id = 9,
                questionText = "BitTorrent is a real-world example of which architecture?",
                options = listOf(
                    "Client-server",
                    "Multi-tier",
                    "Microservices",
                    "Peer-to-peer"
                ),
                correctAnswerIndex = 3,
                explanation = "BitTorrent is a P2P file sharing network where each peer contributes to both upload and download processes."
            ),
            Question(
                id = 10,
                questionText = "What does Multi-Tier (N-Tier) architecture separate a system into?",
                options = listOf(
                    "Clients, servers, and databases",
                    "Presentation, logic, and data layers",
                    "Nodes, middleware, and APIs",
                    "Master, worker, and storage nodes"
                ),
                correctAnswerIndex = 1,
                explanation = "Multi-tier architecture separates the system into layers: presentation (UI), application logic, and data access."
            ),
            Question(
                id = 11,
                questionText = "Which layer in multi-tier architecture handles the user interface?",
                options = listOf(
                    "Data Access Layer",
                    "Middleware Layer",
                    "Presentation Layer",
                    "Application Layer"
                ),
                correctAnswerIndex = 2,
                explanation = "The Presentation Layer is responsible for the user interface — what the user sees and interacts with."
            ),
            Question(
                id = 12,
                questionText = "Which of the following is a LIMITATION of multi-tier architecture?",
                options = listOf(
                    "It cannot support enterprise systems",
                    "Lack of modularity",
                    "Performance overhead due to multiple layers",
                    "It has no separation of concerns"
                ),
                correctAnswerIndex = 2,
                explanation = "A limitation of multi-tier architecture is performance overhead — data must pass through multiple layers, adding latency."
            ),
            Question(
                id = 13,
                questionText = "A web application with a UI layer, business logic layer, and database layer is an example of which architecture?",
                options = listOf(
                    "P2P",
                    "Microservices",
                    "Client-server",
                    "Multi-tier"
                ),
                correctAnswerIndex = 3,
                explanation = "A web application with separate UI, logic, and data layers is a classic example of multi-tier (N-tier) architecture."
            ),
            Question(
                id = 14,
                questionText = "How does microservices architecture structure an application?",
                options = listOf(
                    "As a single monolithic codebase",
                    "As loosely coupled services that communicate via APIs",
                    "As tightly integrated layers sharing one database",
                    "As a peer network with no central coordination"
                ),
                correctAnswerIndex = 1,
                explanation = "Microservices breaks down applications into loosely coupled, independently deployable services that communicate via APIs."
            ),
            Question(
                id = 15,
                questionText = "Which is a key characteristic of microservices architecture?",
                options = listOf(
                    "Centralized data management",
                    "Single responsibility per service",
                    "All services share one database",
                    "Services communicate via shared memory"
                ),
                correctAnswerIndex = 1,
                explanation = "Single Responsibility is a core characteristic — each microservice is responsible for one specific business function."
            ),
            Question(
                id = 16,
                questionText = "What is a BENEFIT of microservices architecture?",
                options = listOf(
                    "Simplified network communication",
                    "Single point of deployment for all services",
                    "Deployment flexibility — services can be updated independently",
                    "No need for inter-service communication"
                ),
                correctAnswerIndex = 2,
                explanation = "Deployment flexibility is a major benefit — individual services can be updated, scaled, or replaced without affecting the entire system."
            ),
            Question(
                id = 17,
                questionText = "What is a LIMITATION of microservices architecture?",
                options = listOf(
                    "Poor scalability",
                    "Inability to use APIs",
                    "Data consistency challenges across services",
                    "It cannot be used for streaming services"
                ),
                correctAnswerIndex = 2,
                explanation = "Data consistency is a key challenge — since each microservice manages its own data, keeping data consistent across services is complex."
            ),
            Question(
                id = 18,
                questionText = "Which company is cited as a real-world example of microservices used for recommendation engines and content delivery?",
                options = listOf(
                    "Google",
                    "BitTorrent",
                    "Netflix",
                    "IBM"
                ),
                correctAnswerIndex = 2,
                explanation = "Netflix uses microservices to manage different functionalities including recommendation engines, content delivery, and user interfaces."
            ),
            Question(
                id = 19,
                questionText = "Which AWS components are mentioned as part of Amazon's microservices-based cloud platform?",
                options = listOf(
                    "GFS, MapReduce, Bigtable",
                    "Lambda, EC2, S3",
                    "Kafka, Zookeeper, HDFS",
                    "Docker, Kubernetes, Jenkins"
                ),
                correctAnswerIndex = 1,
                explanation = "Amazon's AWS microservices platform uses Lambda (serverless functions), EC2 (compute), and S3 (storage) as key components."
            ),
            Question(
                id = 20,
                questionText = "Which architecture would be MOST suitable for a large e-commerce platform that needs to independently scale its payment, authentication, and order management systems?",
                options = listOf(
                    "Client-server",
                    "Peer-to-peer",
                    "Multi-tier",
                    "Microservices"
                ),
                correctAnswerIndex = 3,
                explanation = "Microservices is ideal here — each function (payment, auth, orders) can be developed, deployed, and scaled independently."
            )
        )
    )

    // ── QUIZ 3: Introduction to Cloud Computing ──────────────────────
    private val cloudComputingQuiz = Quiz(
        id = "cloud_computing_week4",
        title = "Introduction to Cloud Computing",
        description = "Week 4 – Cloud Computing Characteristics, Models & Virtualization",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "According to NIST SP 800-145, how many essential characteristics, service models, and deployment models does cloud computing have?",
                options = listOf(
                    "3 characteristics, 4 service models, 5 deployment models",
                    "5 characteristics, 3 service models, 4 deployment models",
                    "4 characteristics, 3 service models, 3 deployment models",
                    "5 characteristics, 4 service models, 3 deployment models"
                ),
                correctAnswerIndex = 1,
                explanation = "According to NIST SP 800-145, cloud computing is composed of 5 essential characteristics, 3 service models, and 4 deployment models."
            ),
            Question(
                id = 2,
                questionText = "Which cloud characteristic allows a consumer to provision computing resources without human interaction with the service provider?",
                options = listOf(
                    "Rapid Elasticity",
                    "Broad Network Access",
                    "On-Demand Self-Service",
                    "Measured Service"
                ),
                correctAnswerIndex = 2,
                explanation = "On-Demand Self-Service allows a consumer to self-provision computing resources without requiring human interaction with each service provider."
            ),
            Question(
                id = 3,
                questionText = "What does 'Broad Network Access' mean in cloud computing?",
                options = listOf(
                    "The cloud can only be accessed via a dedicated private network",
                    "Capabilities are available over the network via standard mechanisms",
                    "The provider pools resources for a single consumer",
                    "Resources automatically scale based on demand"
                ),
                correctAnswerIndex = 1,
                explanation = "Broad Network Access means capabilities are available over the network and accessed through standard mechanisms, enabling access from various devices."
            ),
            Question(
                id = 4,
                questionText = "Which essential characteristic refers to the provider's resources being pooled to serve multiple consumers using a multi-tenant model?",
                options = listOf(
                    "Measured Service",
                    "Rapid Elasticity",
                    "On-Demand Self-Service",
                    "Resource Pooling"
                ),
                correctAnswerIndex = 3,
                explanation = "Resource Pooling means the provider's computing resources are pooled to serve multiple consumers using a multi-tenant model."
            ),
            Question(
                id = 5,
                questionText = "What does 'Rapid Elasticity' mean in cloud computing?",
                options = listOf(
                    "Resources are billed based on usage",
                    "The network can be accessed from anywhere",
                    "Capabilities can be scaled in and out automatically to match demand",
                    "A single software instance serves multiple tenants"
                ),
                correctAnswerIndex = 2,
                explanation = "Rapid Elasticity means capabilities can be elastically provisioned and released, in some cases automatically, to scale rapidly with demand."
            ),
            Question(
                id = 6,
                questionText = "Which cloud characteristic involves automatically controlling and optimizing resource use through a metering capability?",
                options = listOf(
                    "Broad Network Access",
                    "Measured Service",
                    "Resource Pooling",
                    "On-Demand Self-Service"
                ),
                correctAnswerIndex = 1,
                explanation = "Measured Service means cloud systems automatically control and optimize resource use by leveraging a metering capability — usage is monitored and reported."
            ),
            Question(
                id = 7,
                questionText = "Which cloud service model provides the basic building blocks for cloud IT — networking, compute, and storage?",
                options = listOf(
                    "SaaS",
                    "PaaS",
                    "IaaS",
                    "DaaS"
                ),
                correctAnswerIndex = 2,
                explanation = "Infrastructure as a Service (IaaS) provides access to networking features, computers (virtual or dedicated hardware), and data storage space — the basic building blocks of cloud IT."
            ),
            Question(
                id = 8,
                questionText = "Which cloud service model provides the highest level of flexibility and management control over IT resources?",
                options = listOf(
                    "SaaS",
                    "PaaS",
                    "Community Cloud",
                    "IaaS"
                ),
                correctAnswerIndex = 3,
                explanation = "IaaS provides the highest level of flexibility and management control over IT resources, most closely resembling traditional on-premises IT."
            ),
            Question(
                id = 9,
                questionText = "In which cloud service model does the organization focus purely on application development while the provider manages the OS, web servers, and runtime environments?",
                options = listOf(
                    "IaaS",
                    "SaaS",
                    "PaaS",
                    "Hybrid Cloud"
                ),
                correctAnswerIndex = 2,
                explanation = "PaaS removes the need to manage underlying infrastructure. The provider handles the OS, execution environments, and servers, so the organization can focus on application development."
            ),
            Question(
                id = 10,
                questionText = "Which of the following is an example of a PaaS product?",
                options = listOf(
                    "Microsoft Office 365",
                    "Google App Engine",
                    "VMware vSphere",
                    "Salesforce.com"
                ),
                correctAnswerIndex = 1,
                explanation = "Google App Engine is a PaaS product. Microsoft Office 365 and Salesforce.com are SaaS examples, while VMware vSphere is a Type 1 hypervisor."
            ),
            Question(
                id = 11,
                questionText = "What is Software as a Service (SaaS)?",
                options = listOf(
                    "A service providing raw compute, storage, and networking",
                    "A completed product run and managed by the service provider",
                    "A platform for developers to build and deploy applications",
                    "A private cloud deployment for a single organization"
                ),
                correctAnswerIndex = 1,
                explanation = "SaaS provides a completed product that is run and managed by the service provider. Cloud providers install and operate the application software in the cloud."
            ),
            Question(
                id = 12,
                questionText = "What is a common example of a SaaS application mentioned in the lecture?",
                options = listOf(
                    "Amazon EC2",
                    "Google App Engine",
                    "Web-based email",
                    "VMware Workstation"
                ),
                correctAnswerIndex = 2,
                explanation = "Web-based email is cited as a common example of a SaaS application — the software is run and managed by the provider, accessed via a browser."
            ),
            Question(
                id = 13,
                questionText = "What is the pricing model typically used for SaaS applications?",
                options = listOf(
                    "One-time licensing fee",
                    "Pay per API call",
                    "Monthly or yearly flat fee per customer",
                    "Pay per CPU cycle used"
                ),
                correctAnswerIndex = 2,
                explanation = "The pricing model for SaaS applications is typically based on a monthly or yearly flat fee per customer."
            ),
            Question(
                id = 14,
                questionText = "Which of the following is NOT one of the four cloud deployment models?",
                options = listOf(
                    "Public Cloud",
                    "Hybrid Cloud",
                    "Distributed Cloud",
                    "Community Cloud"
                ),
                correctAnswerIndex = 2,
                explanation = "The four deployment models are Public, Private, Community, and Hybrid Cloud. Distributed Cloud is not one of the four defined deployment models."
            ),
            Question(
                id = 15,
                questionText = "Which cloud deployment model is shared among organizations with common concerns such as security or compliance?",
                options = listOf(
                    "Public Cloud",
                    "Private Cloud",
                    "Hybrid Cloud",
                    "Community Cloud"
                ),
                correctAnswerIndex = 3,
                explanation = "Community Cloud is shared among several organizations with common concerns (e.g., mission, security, policy, compliance requirements)."
            ),
            Question(
                id = 16,
                questionText = "Which deployment model combines both private and public cloud environments connected over the internet?",
                options = listOf(
                    "Community Cloud",
                    "Hybrid Cloud",
                    "Private Cloud",
                    "Multi-tenant Cloud"
                ),
                correctAnswerIndex = 1,
                explanation = "Hybrid Cloud combines public and private cloud environments, allowing data and applications to be shared between them via the internet."
            ),
            Question(
                id = 17,
                questionText = "What is a hypervisor?",
                options = listOf(
                    "A physical server that hosts cloud applications",
                    "Software that creates and runs virtual machines",
                    "A container that virtualizes the operating system",
                    "A network switch used in cloud data centers"
                ),
                correctAnswerIndex = 1,
                explanation = "A hypervisor, also known as a Virtual Machine Monitor (VMM), is software that creates and runs virtual machines (VMs)."
            ),
            Question(
                id = 18,
                questionText = "What is a Type 1 hypervisor also known as?",
                options = listOf(
                    "Hosted hypervisor",
                    "Container engine",
                    "Bare-metal hypervisor",
                    "Virtual machine monitor layer"
                ),
                correctAnswerIndex = 2,
                explanation = "A Type 1 hypervisor runs directly on the host's hardware and is also called a Bare-metal hypervisor. It is more secure and efficient than Type 2."
            ),
            Question(
                id = 19,
                questionText = "How does a Type 2 hypervisor differ from a Type 1?",
                options = listOf(
                    "Type 2 runs directly on hardware with no OS beneath it",
                    "Type 2 is more secure and efficient than Type 1",
                    "Type 2 runs as a software layer on top of an existing operating system",
                    "Type 2 is used exclusively in enterprise deployments"
                ),
                correctAnswerIndex = 2,
                explanation = "A Type 2 hypervisor runs as a software layer on an operating system, like other computer programs, unlike Type 1 which runs directly on hardware."
            ),
            Question(
                id = 20,
                questionText = "What is Multitenancy in cloud computing?",
                options = listOf(
                    "A model where each customer gets a dedicated server instance",
                    "A principle where a single software instance serves multiple client organizations",
                    "A deployment model combining public and private clouds",
                    "A security model that isolates each virtual machine completely"
                ),
                correctAnswerIndex = 1,
                explanation = "Multitenancy refers to a principle where a single instance of software runs on a server, serving multiple client organizations (tenants) — core to cloud infrastructure."
            )
        )
    )

    // ── QUIZ 4: Overview of Azure Core Services ──────────────────────
    private val azureCoreServicesQuiz = Quiz(
        id = "azure_core_services_week5",
        title = "Microsoft Azure Core Services",
        description = "Week 5 – Introduction to Microsoft Azure and its Core Services",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What type of expenditure does cloud computing fall under?",
                options = listOf(
                    "Capital Expenditure (CapEx)",
                    "Operational Expenditure (OpEx)",
                    "Fixed Expenditure (FixEx)",
                    "Infrastructure Expenditure (InfEx)"
                ),
                correctAnswerIndex = 1,
                explanation = "Cloud computing falls under Operational Expenditure (OpEx) because it operates on a consumption-based model — you pay for what you use, not for physical infrastructure."
            ),
            Question(
                id = 2,
                questionText = "What is Capital Expenditure (CapEx) in the context of IT infrastructure?",
                options = listOf(
                    "Paying only for resources you consume monthly",
                    "An upfront spend on physical infrastructure such as servers and datacenters",
                    "A subscription-based payment model for cloud services",
                    "A pay-as-you-go billing approach"
                ),
                correctAnswerIndex = 1,
                explanation = "CapEx refers to upfront spending on physical infrastructure — like purchasing servers, buildings, and equipment — which is the traditional on-premises model."
            ),
            Question(
                id = 3,
                questionText = "Which of the following is a benefit of the cloud's consumption-based model?",
                options = listOf(
                    "You must pay upfront for all resources",
                    "You purchase and manage infrastructure at full capacity",
                    "You can stop paying for resources that are no longer needed",
                    "You pay a fixed monthly fee regardless of usage"
                ),
                correctAnswerIndex = 2,
                explanation = "A key benefit of the consumption-based model is the ability to stop paying for resources that are no longer needed, avoiding waste."
            ),
            Question(
                id = 4,
                questionText = "With cloud computing, what do you NOT pay for compared to maintaining your own datacenter?",
                options = listOf(
                    "The IT resources you use",
                    "API calls made to cloud services",
                    "Physical infrastructure, electricity, and security",
                    "Storage consumed by your applications"
                ),
                correctAnswerIndex = 2,
                explanation = "With cloud computing, you don't pay for physical infrastructure, electricity, security, or anything associated with maintaining a datacenter — only for IT resources used."
            ),
            Question(
                id = 5,
                questionText = "Which of the following best describes the 'Pay as you go' cloud model?",
                options = listOf(
                    "Pay a large upfront cost for guaranteed resources",
                    "Pay a fixed yearly subscription regardless of consumption",
                    "Plan and manage operating costs and scale as business needs change",
                    "Purchase hardware and depreciate it over time"
                ),
                correctAnswerIndex = 2,
                explanation = "The pay-as-you-go model lets you plan and manage operating costs, run infrastructure more efficiently, and scale as your business needs change."
            ),
            Question(
                id = 6,
                questionText = "What is an Azure Region?",
                options = listOf(
                    "A single server rack in a Microsoft datacenter",
                    "A geographic area containing one or more datacenters",
                    "A logical grouping of Azure subscriptions",
                    "An isolated instance of Azure for government use"
                ),
                correctAnswerIndex = 1,
                explanation = "An Azure Region is a geographical area containing one or more datacenters that are nearby and networked together, providing low-latency connections."
            ),
            Question(
                id = 7,
                questionText = "What is the purpose of Azure Availability Zones?",
                options = listOf(
                    "To group subscriptions under a management hierarchy",
                    "To provide isolated physical datacenters within a region for high availability",
                    "To restrict access to Azure services to specific countries",
                    "To reduce the cost of storage services"
                ),
                correctAnswerIndex = 1,
                explanation = "Availability Zones are physically separate datacenters within an Azure region, providing redundancy and high availability by protecting against datacenter failures."
            ),
            Question(
                id = 8,
                questionText = "What are Azure Region Pairs?",
                options = listOf(
                    "Two Azure subscriptions linked under one billing account",
                    "Two availability zones within the same datacenter",
                    "Two Azure regions paired together for disaster recovery and redundancy",
                    "Two resource groups sharing the same virtual network"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Region Pairs are two Azure regions paired together, typically at least 300 miles apart, to provide disaster recovery and business continuity during outages."
            ),
            Question(
                id = 9,
                questionText = "What are Azure Sovereign Regions?",
                options = listOf(
                    "Premium Azure regions with faster network speeds",
                    "Instances of Azure isolated from the main instance for compliance or legal purposes",
                    "Regions exclusively available to enterprise customers",
                    "Azure regions located only in Europe"
                ),
                correctAnswerIndex = 1,
                explanation = "Sovereign Regions are instances of Azure isolated from the main instance, used for compliance or legal purposes — such as US government regions and China regions."
            ),
            Question(
                id = 10,
                questionText = "Which of the following is an example of an Azure Sovereign Region?",
                options = listOf(
                    "Azure UK South",
                    "Azure East US",
                    "US Gov Virginia",
                    "Azure West Europe"
                ),
                correctAnswerIndex = 2,
                explanation = "US Gov Virginia is an Azure Sovereign Region — a physical and logical network-isolated instance operated by screened U.S. personnel for government agencies."
            ),
            Question(
                id = 11,
                questionText = "How are China Azure regions different from standard Azure regions?",
                options = listOf(
                    "They are operated directly by Microsoft with extra security",
                    "They are available through a partnership between Microsoft and 21Vianet, where Microsoft doesn't directly maintain the datacenters",
                    "They use a different billing model based on CapEx",
                    "They are open to all public consumers worldwide"
                ),
                correctAnswerIndex = 1,
                explanation = "China Azure regions (China East, China North) are available through a unique partnership between Microsoft and 21Vianet — Microsoft doesn't directly maintain these datacenters."
            ),
            Question(
                id = 12,
                questionText = "What is an Azure Resource Group?",
                options = listOf(
                    "A physical datacenter housing Azure servers",
                    "A billing account for managing Azure costs",
                    "A logical container that holds related Azure resources",
                    "A government-isolated instance of Azure"
                ),
                correctAnswerIndex = 2,
                explanation = "An Azure Resource Group is a logical container used to group related Azure resources (like VMs, databases, storage) for easier management and organization."
            ),
            Question(
                id = 13,
                questionText = "What is an Azure Subscription?",
                options = listOf(
                    "A physical server allocation in an Azure datacenter",
                    "A unit of management and billing that provides authenticated access to Azure services",
                    "A type of Availability Zone for enterprise customers",
                    "A container for grouping multiple management groups"
                ),
                correctAnswerIndex = 1,
                explanation = "An Azure Subscription provides authenticated and authorized access to Azure products and services, and is also a unit of management, billing, and scale."
            ),
            Question(
                id = 14,
                questionText = "What is the purpose of Azure Management Groups?",
                options = listOf(
                    "To physically group Azure datacenters by geography",
                    "To manage virtual machine configurations",
                    "To provide a level of scope above subscriptions for organizing and governing multiple subscriptions",
                    "To monitor resource usage and billing within a single subscription"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Management Groups provide a level of scope above subscriptions, allowing you to organize subscriptions and apply governance policies across them."
            ),
            Question(
                id = 15,
                questionText = "What is the correct hierarchy of Azure management infrastructure from largest to smallest scope?",
                options = listOf(
                    "Resource Groups → Subscriptions → Management Groups",
                    "Management Groups → Subscriptions → Resource Groups",
                    "Subscriptions → Management Groups → Resource Groups",
                    "Resource Groups → Management Groups → Subscriptions"
                ),
                correctAnswerIndex = 1,
                explanation = "The Azure hierarchy from largest to smallest scope is: Management Groups → Subscriptions → Resource Groups → Resources."
            ),
            Question(
                id = 16,
                questionText = "Which Azure account type is specifically designed for students?",
                options = listOf(
                    "Azure Enterprise Account",
                    "Microsoft Learn Sandbox",
                    "Azure Free Student Account",
                    "Azure Pay-As-You-Go Account"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure offers a Free Student Account specifically for students, providing free access to certain Azure services without requiring a credit card."
            ),
            Question(
                id = 17,
                questionText = "What is the Microsoft Learn Sandbox?",
                options = listOf(
                    "A paid Azure subscription for professional developers",
                    "A temporary Azure environment for learning without affecting your own subscription or incurring costs",
                    "A private cloud deployment model for enterprises",
                    "A sovereign region reserved for educational institutions"
                ),
                correctAnswerIndex = 1,
                explanation = "The Microsoft Learn Sandbox provides a temporary Azure environment that lets learners practice Azure skills without using their own subscription or incurring costs."
            ),
            Question(
                id = 18,
                questionText = "Which of the following is a key advantage of the cloud's consumption-based model over traditional on-premises infrastructure?",
                options = listOf(
                    "You own all the physical hardware outright",
                    "No upfront costs and no need to purchase infrastructure that may not be fully used",
                    "Fixed monthly costs regardless of how much you use",
                    "You are responsible for all hardware maintenance"
                ),
                correctAnswerIndex = 1,
                explanation = "The consumption-based model eliminates upfront costs and the need to purchase costly infrastructure that might not be used to its fullest potential."
            ),
            Question(
                id = 19,
                questionText = "What is an Azure Datacenter?",
                options = listOf(
                    "A logical grouping of Azure resources for billing",
                    "A physical facility housing the servers, networking, and storage that power Azure services",
                    "A virtual environment for running Azure management groups",
                    "A subscription tier for large enterprise customers"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Datacenters are physical facilities around the world that house the servers, networking equipment, and storage infrastructure that power Azure cloud services."
            ),
            Question(
                id = 20,
                questionText = "Which of the following correctly describes the relationship between Azure Regions and Availability Zones?",
                options = listOf(
                    "A region is a single datacenter; availability zones span multiple regions",
                    "Availability zones are geographic areas; regions are isolated datacenters within them",
                    "A region is a geographic area that may contain multiple availability zones, each being a separate physical datacenter",
                    "Regions and availability zones are the same concept with different names"
                ),
                correctAnswerIndex = 2,
                explanation = "An Azure Region is a geographic area that can contain multiple Availability Zones. Each Availability Zone is a physically separate datacenter within that region, providing redundancy."
            )
        )
    )

    // ── QUIZ 5: Introduction to VMs and Containers ───────────────────
    private val vmsAndContainersQuiz = Quiz(
        id = "vms_and_containers_week6",
        title = "VMs and Containers",
        description = "Week 6 – Introduction to Virtual Machines and Containers",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What type of cloud service do Azure Virtual Machines (VMs) provide?",
                options = listOf(
                    "Software as a Service (SaaS)",
                    "Platform as a Service (PaaS)",
                    "Infrastructure as a Service (IaaS)",
                    "Database as a Service (DBaaS)"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure VMs provide Infrastructure as a Service (IaaS) in the form of a virtualized server, giving you full control over the OS and software."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is a reason to choose an Azure Virtual Machine?",
                options = listOf(
                    "You want the provider to manage the operating system",
                    "You need total control over the operating system and custom software",
                    "You want the lightest possible compute option",
                    "You need to run multiple apps on a single OS instance"
                ),
                correctAnswerIndex = 1,
                explanation = "VMs are ideal when you need total control over the OS, the ability to run custom software, and custom hosting configurations."
            ),
            Question(
                id = 3,
                questionText = "What is the 'lift and shift' approach when moving to the cloud?",
                options = listOf(
                    "Rebuilding an application from scratch using cloud-native services",
                    "Creating an image of a physical server and hosting it in a VM with little or no changes",
                    "Migrating databases to a managed cloud database service",
                    "Converting a monolithic application into microservices"
                ),
                correctAnswerIndex = 1,
                explanation = "Lift and shift means creating an image of a physical server and hosting it within a VM in the cloud with little or no changes to the application."
            ),
            Question(
                id = 4,
                questionText = "When using Azure VMs, who is responsible for maintaining the OS and installed software?",
                options = listOf(
                    "Microsoft Azure automatically manages all OS updates",
                    "The cloud provider handles all maintenance",
                    "The customer is responsible for maintaining the OS and software",
                    "A third-party managed service provider"
                ),
                correctAnswerIndex = 2,
                explanation = "Just like a physical on-premises server, when using VMs you are responsible for maintaining the installed OS and software."
            ),
            Question(
                id = 5,
                questionText = "Which of the following is NOT a VM resource you need to configure in Azure?",
                options = listOf(
                    "Size (processor cores and RAM)",
                    "Storage disks (HDD, SSD)",
                    "Networking (virtual network, public IP)",
                    "Programming language runtime"
                ),
                correctAnswerIndex = 3,
                explanation = "VM resources include size (CPU/RAM), storage disks, and networking. Programming language runtimes are managed at the application layer, not the VM infrastructure level."
            ),
            Question(
                id = 6,
                questionText = "What is the purpose of Virtual Machine Availability Sets?",
                options = listOf(
                    "To automatically scale VMs based on CPU usage",
                    "To provide a desktop environment in the cloud",
                    "To ensure VMs stagger updates and have varied power and network connectivity for high availability",
                    "To group VMs by geographic region"
                ),
                correctAnswerIndex = 2,
                explanation = "Availability Sets ensure VMs stagger updates and have varied power and network connectivity, preventing you from losing all VMs with a single network or power failure."
            ),
            Question(
                id = 7,
                questionText = "How do Availability Sets group VMs to ensure resilience?",
                options = listOf(
                    "By region and availability zone",
                    "By update domain and fault domain",
                    "By subscription and resource group",
                    "By CPU size and storage type"
                ),
                correctAnswerIndex = 1,
                explanation = "Availability Sets group VMs into two categories: Update Domains (to stagger OS updates) and Fault Domains (to separate power and network connectivity)."
            ),
            Question(
                id = 8,
                questionText = "What is the additional cost for configuring a VM Availability Set in Azure?",
                options = listOf(
                    "A flat monthly fee per availability set",
                    "10% surcharge on all VM instances in the set",
                    "No additional cost — you only pay for the VM instances you create",
                    "A one-time setup fee per region"
                ),
                correctAnswerIndex = 2,
                explanation = "There is no additional cost for configuring an availability set. You only pay for the VM instances you create within it."
            ),
            Question(
                id = 9,
                questionText = "What is a key limitation of Virtual Machines compared to containers?",
                options = listOf(
                    "VMs cannot run custom software",
                    "VMs are limited to a single operating system per virtual machine",
                    "VMs do not support networking configurations",
                    "VMs cannot be used for legacy applications"
                ),
                correctAnswerIndex = 1,
                explanation = "VMs are limited to a single operating system per virtual machine. If you need multiple instances of an application on one host, containers are a better choice."
            ),
            Question(
                id = 10,
                questionText = "How do containers differ from virtual machines in terms of OS management?",
                options = listOf(
                    "Containers require you to manage a full OS just like VMs",
                    "Containers each run their own separate operating system",
                    "Unlike VMs, you don't manage the operating system for a container",
                    "Containers can only run on Windows operating systems"
                ),
                correctAnswerIndex = 2,
                explanation = "Unlike VMs where you manage the OS, containers share the host OS. You don't manage the operating system for a container, making them lighter and faster."
            ),
            Question(
                id = 11,
                questionText = "Which of the following best describes containers?",
                options = listOf(
                    "Heavy, slow-to-start virtualized servers",
                    "Lightweight, fast-starting, portable virtualization environments",
                    "Physical servers hosted in Azure datacenters",
                    "A type of Azure management group"
                ),
                correctAnswerIndex = 1,
                explanation = "Containers are lightweight, designed to start in seconds, are portable across environments, and can be created, scaled out, and stopped dynamically."
            ),
            Question(
                id = 12,
                questionText = "What is one of the most popular container engines supported by Azure?",
                options = listOf(
                    "VMware",
                    "VirtualBox",
                    "Docker",
                    "Hyper-V"
                ),
                correctAnswerIndex = 2,
                explanation = "Docker is one of the most popular container engines, and Azure supports Docker for building and running containerized applications."
            ),
            Question(
                id = 13,
                questionText = "Containers are often used to create solutions using which architecture?",
                options = listOf(
                    "Monolithic architecture",
                    "Client-server architecture",
                    "Multi-tier architecture",
                    "Microservice architecture"
                ),
                correctAnswerIndex = 3,
                explanation = "Containers are often used with a microservice architecture, where solutions are broken into smaller, independent pieces that can be maintained, scaled, or updated independently."
            ),
            Question(
                id = 14,
                questionText = "In a containerized web application, which of the following demonstrates a benefit of containers?",
                options = listOf(
                    "The entire application must be redeployed if any component changes",
                    "The back end can be scaled independently without impacting the front end or storage",
                    "All containers must run on the same physical host",
                    "Containers cannot be updated without downtime"
                ),
                correctAnswerIndex = 1,
                explanation = "Containers allow independent scaling — if the back end reaches capacity, you can scale it separately without affecting the front end or storage containers."
            ),
            Question(
                id = 15,
                questionText = "Which compute type is BEST suited for running legacy applications that require a specific OS environment?",
                options = listOf(
                    "Containers",
                    "Azure Functions",
                    "Virtual Machines",
                    "Azure Web Apps"
                ),
                correctAnswerIndex = 2,
                explanation = "Virtual Machines are ideal for legacy applications and environments requiring a specific OS, as they support running multiple OS environments with full control."
            ),
            Question(
                id = 16,
                questionText = "Which compute type is BEST suited for microservices and CI/CD pipelines?",
                options = listOf(
                    "Virtual Machines",
                    "Containers",
                    "Azure Virtual Desktop",
                    "Availability Sets"
                ),
                correctAnswerIndex = 1,
                explanation = "Containers are best for microservices and cloud-native applications, and are efficient for CI/CD (Continuous Integration/Continuous Deployment) pipelines."
            ),
            Question(
                id = 17,
                questionText = "What is Kubernetes?",
                options = listOf(
                    "A type of Azure virtual network",
                    "A container engine similar to Docker",
                    "An open-source platform that automates deployment, scaling, and management of containerized applications",
                    "A Microsoft proprietary hypervisor"
                ),
                correctAnswerIndex = 2,
                explanation = "Kubernetes is an open-source platform for managing containerized applications. It automates deployment, scaling, and management — known as container orchestration."
            ),
            Question(
                id = 18,
                questionText = "What does AKS stand for in the context of Azure?",
                options = listOf(
                    "Azure Key Storage",
                    "Azure Kubernetes Service",
                    "Automated Kubernetes Scheduling",
                    "Azure Kernel System"
                ),
                correctAnswerIndex = 1,
                explanation = "AKS stands for Azure Kubernetes Service — Microsoft's managed Kubernetes offering that simplifies deploying and managing containerized applications on Azure."
            ),
            Question(
                id = 19,
                questionText = "What is the key difference between Docker and Kubernetes?",
                options = listOf(
                    "Docker is for orchestration; Kubernetes is for building containers",
                    "Docker builds and runs containers; Kubernetes orchestrates and manages multiple containers at scale",
                    "Docker is open-source; Kubernetes is proprietary to Microsoft",
                    "Docker only works on Linux; Kubernetes works on all platforms"
                ),
                correctAnswerIndex = 1,
                explanation = "Docker is used to build and run individual containers, while Kubernetes is an orchestration platform that manages, scales, and automates deployment of multiple containers."
            ),
            Question(
                id = 20,
                questionText = "Which of the following is a characteristic of containers that makes them suitable for cloud-native applications?",
                options = listOf(
                    "They require a full OS installation per instance",
                    "They are slow to start but very stable",
                    "They are lightweight, portable, and can be quickly restarted after a crash",
                    "They cannot be moved between environments"
                ),
                correctAnswerIndex = 2,
                explanation = "Containers are lightweight, portable across environments, and can quickly restart after a crash or hardware interruption — making them ideal for cloud-native, resilient applications."
            )
        )
    )

    // ── QUIZ 6: Azure Networking Fundamentals ────────────────────────
    private val azureNetworkingQuiz = Quiz(
        id = "azure_networking_week7",
        title = "Azure Networking Fundamentals",
        description = "Week 7 – Azure Virtual Networks, DNS, Load Balancers & NSGs",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is an Azure Virtual Network (VNet)?",
                options = listOf(
                    "A physical network cable connecting Azure datacenters",
                    "A private network for managing and securely connecting Azure resources",
                    "A public internet connection provided by Microsoft",
                    "A load balancer that distributes traffic across regions"
                ),
                correctAnswerIndex = 1,
                explanation = "An Azure Virtual Network (VNet) is a private network that allows Azure resources to securely communicate, offering isolation, segmentation, and routing within Azure."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is NOT a reason to use an Azure Virtual Network?",
                options = listOf(
                    "Communication of Azure resources with the internet",
                    "Filtering of network traffic",
                    "Replacing physical servers with virtual machines",
                    "Communication with on-premises resources"
                ),
                correctAnswerIndex = 2,
                explanation = "VNets are used for communication, traffic filtering, routing, and integration with Azure services — not for replacing physical servers with VMs, which is a VM/IaaS concern."
            ),
            Question(
                id = 3,
                questionText = "What does a subnet do within an Azure Virtual Network?",
                options = listOf(
                    "It connects two separate VNets together",
                    "It segments the VNet into smaller, more manageable IP address ranges",
                    "It provides DNS resolution for Azure resources",
                    "It monitors the health of backend resources"
                ),
                correctAnswerIndex = 1,
                explanation = "Subnets segment a VNet into smaller IP address ranges, allowing you to organize and isolate resources within the same virtual network."
            ),
            Question(
                id = 4,
                questionText = "What is the difference between a Public IP and a Private IP in Azure?",
                options = listOf(
                    "Public IPs are used only within a VNet; Private IPs are accessible from the internet",
                    "Public IPs are accessible from the internet; Private IPs are used within a VNet for internal communication",
                    "Public IPs are assigned to subnets; Private IPs are assigned to VNets",
                    "There is no difference — both are accessible from the internet"
                ),
                correctAnswerIndex = 1,
                explanation = "Public IPs allow Azure resources to communicate with the internet, while Private IPs are used for internal communication within a VNet or on-premises network."
            ),
            Question(
                id = 5,
                questionText = "What is Azure DNS used for?",
                options = listOf(
                    "Distributing network traffic across multiple servers",
                    "Filtering inbound and outbound network traffic",
                    "Translating domain names into IP addresses for Azure-hosted services",
                    "Connecting on-premises networks to Azure via a secure tunnel"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure DNS provides domain name resolution, translating human-readable domain names into IP addresses for resources hosted in Azure."
            ),
            Question(
                id = 6,
                questionText = "What is the primary purpose of an Azure Load Balancer?",
                options = listOf(
                    "To encrypt traffic between Azure resources",
                    "To distribute incoming network traffic across multiple backend servers",
                    "To monitor the health of Virtual Networks",
                    "To create private subnets within a VNet"
                ),
                correctAnswerIndex = 1,
                explanation = "An Azure Load Balancer distributes incoming traffic across multiple servers to ensure high availability, scalability, and reliability of applications."
            ),
            Question(
                id = 7,
                questionText = "What are the two types of Azure Load Balancers?",
                options = listOf(
                    "Internal and External Load Balancers",
                    "Public and Internal Load Balancers",
                    "Layer 4 and Layer 7 Load Balancers",
                    "Static and Dynamic Load Balancers"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure has two types of load balancers: Public Load Balancers (route external internet traffic to Azure resources) and Internal Load Balancers (handle traffic within a VNet)."
            ),
            Question(
                id = 8,
                questionText = "What does a Public Load Balancer do?",
                options = listOf(
                    "Handles traffic only within an internal VNet",
                    "Routes external internet traffic to Azure resources",
                    "Monitors the health of backend VMs",
                    "Assigns private IP addresses to subnets"
                ),
                correctAnswerIndex = 1,
                explanation = "A Public Load Balancer routes external traffic from the internet to Azure resources, making applications accessible to public users."
            ),
            Question(
                id = 9,
                questionText = "What does an Internal Load Balancer handle?",
                options = listOf(
                    "Traffic coming in from the public internet",
                    "DNS resolution for Azure resources",
                    "Traffic within a Virtual Network (VNet)",
                    "Encryption of data between Azure regions"
                ),
                correctAnswerIndex = 2,
                explanation = "An Internal Load Balancer handles traffic within a VNet, distributing it among internal resources without exposing them to the public internet."
            ),
            Question(
                id = 10,
                questionText = "Which load balancing algorithms are used by Azure Load Balancers?",
                options = listOf(
                    "FIFO and LIFO",
                    "Source IP affinity and round-robin",
                    "Weighted and priority-based",
                    "Shortest path and least connections"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Load Balancers use Source IP affinity (sticky sessions) and round-robin as their balancing algorithms to distribute traffic across backend resources."
            ),
            Question(
                id = 11,
                questionText = "What is the Front-End IP Configuration of an Azure Load Balancer?",
                options = listOf(
                    "The list of backend VMs receiving traffic",
                    "The health monitoring component of the load balancer",
                    "The public or private IP address that clients connect to",
                    "The DNS name assigned to the load balancer"
                ),
                correctAnswerIndex = 2,
                explanation = "The Front-End IP Configuration defines the public or private IP address that clients use to reach the load balancer — the entry point for incoming traffic."
            ),
            Question(
                id = 12,
                questionText = "What is the Back-End Pool in an Azure Load Balancer?",
                options = listOf(
                    "The IP configuration clients connect to",
                    "The group of resources (e.g. VMs) that receive distributed traffic",
                    "The DNS records associated with the load balancer",
                    "The firewall rules controlling inbound traffic"
                ),
                correctAnswerIndex = 1,
                explanation = "The Back-End Pool is the set of resources (such as VMs) sitting behind the load balancer that receive and process the distributed incoming traffic."
            ),
            Question(
                id = 13,
                questionText = "What is the role of Health Probes in an Azure Load Balancer?",
                options = listOf(
                    "To assign IP addresses to backend resources",
                    "To encrypt traffic between the load balancer and backend VMs",
                    "To monitor the health of backend resources and route traffic only to healthy ones",
                    "To configure DNS entries for the load balancer"
                ),
                correctAnswerIndex = 2,
                explanation = "Health Probes continuously monitor the health of backend resources. If a resource becomes unhealthy, the load balancer stops sending traffic to it."
            ),
            Question(
                id = 14,
                questionText = "What are Network Security Groups (NSGs) in Azure?",
                options = listOf(
                    "Groups of virtual machines organized by workload",
                    "Rules that control inbound and outbound network traffic to Azure resources",
                    "DNS zones for managing domain names in Azure",
                    "Load balancing policies for distributing traffic"
                ),
                correctAnswerIndex = 1,
                explanation = "Network Security Groups (NSGs) contain security rules that control inbound and outbound network traffic based on source, destination, protocol, and port."
            ),
            Question(
                id = 15,
                questionText = "What criteria can NSG rules be based on?",
                options = listOf(
                    "VM size, storage type, and region",
                    "Source, destination, protocol, and port",
                    "Subscription ID, resource group, and tag",
                    "CPU usage, memory, and disk I/O"
                ),
                correctAnswerIndex = 1,
                explanation = "NSG rules are defined based on source IP, destination IP, protocol (TCP/UDP), and port number — allowing fine-grained control over network traffic."
            ),
            Question(
                id = 16,
                questionText = "Where can NSGs be applied in Azure?",
                options = listOf(
                    "Only to entire VNets",
                    "Only to individual VMs",
                    "To subnets or individual network interfaces of resources",
                    "Only to Azure Load Balancers"
                ),
                correctAnswerIndex = 2,
                explanation = "NSGs can be applied at two levels: to subnets (affecting all resources in the subnet) or to individual network interfaces of specific resources."
            ),
            Question(
                id = 17,
                questionText = "What type of traffic do NSGs control?",
                options = listOf(
                    "Only inbound internet traffic",
                    "Only outbound traffic to the internet",
                    "Both inbound and outbound network traffic",
                    "Only traffic between Azure regions"
                ),
                correctAnswerIndex = 2,
                explanation = "NSGs control both inbound AND outbound network traffic, giving you bidirectional control over what can enter and leave your Azure resources."
            ),
            Question(
                id = 18,
                questionText = "Which Azure networking feature allows resources in different VNets to communicate as if they are on the same network?",
                options = listOf(
                    "Network Security Groups",
                    "VNet Peering",
                    "Azure DNS",
                    "Health Probes"
                ),
                correctAnswerIndex = 1,
                explanation = "VNet Peering allows resources in different Azure Virtual Networks to communicate with each other privately, as if they were on the same network."
            ),
            Question(
                id = 19,
                questionText = "Which of the following best describes routing in an Azure Virtual Network?",
                options = listOf(
                    "Automatically assigning domain names to resources",
                    "Distributing traffic evenly across backend servers",
                    "Controlling how network traffic is directed between subnets, VNets, and on-premises networks",
                    "Monitoring the health of resources in a backend pool"
                ),
                correctAnswerIndex = 2,
                explanation = "Routing in a VNet controls how network traffic is directed — between subnets, across peered VNets, to on-premises networks, or to the internet."
            ),
            Question(
                id = 20,
                questionText = "In a secure web application architecture on Azure, what is the typical role of an NSG combined with a Load Balancer?",
                options = listOf(
                    "NSG handles traffic distribution; Load Balancer filters malicious traffic",
                    "Load Balancer distributes traffic across backend servers while NSG controls which traffic is allowed in and out",
                    "Both NSG and Load Balancer perform DNS resolution for the application",
                    "NSG replaces the need for a Load Balancer in high-availability scenarios"
                ),
                correctAnswerIndex = 1,
                explanation = "In a secure architecture, the Load Balancer distributes incoming traffic across backend servers for availability, while the NSG controls and filters which traffic is allowed in and out — providing security."
            )
        )
    )

    // ── QUIZ 7: Test 1 Practice Questions ────────────────────────────
    private val test1Quiz = Quiz(
        id = "test1_practice",
        title = "Test 1 Practice",
        description = "Test 1 – Cloud Computing & Azure Practice Questions",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "Which of the following is NOT a characteristic of cloud computing?",
                options = listOf(
                    "Broad network access",
                    "On-demand self-service",
                    "Manual resource provisioning",
                    "Resource pooling"
                ),
                correctAnswerIndex = 2,
                explanation = "Manual resource provisioning is NOT a cloud characteristic. Cloud computing features on-demand self-service, meaning resources are provisioned automatically without human interaction."
            ),
            Question(
                id = 2,
                questionText = "Which cloud service model offers virtual machines and storage on demand?",
                options = listOf(
                    "Software as a Service (SaaS)",
                    "Infrastructure as a Service (IaaS)",
                    "Platform as a Service (PaaS)",
                    "Function as a Service (FaaS)"
                ),
                correctAnswerIndex = 1,
                explanation = "IaaS provides the basic building blocks of cloud IT including virtual machines, storage, and networking on demand, giving users the highest level of control."
            ),
            Question(
                id = 3,
                questionText = "Azure Blob Storage is best suited for:",
                options = listOf(
                    "Structured data storage",
                    "Unstructured data storage",
                    "Real-time transaction processing",
                    "Database query optimization"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Blob Storage is optimized for storing massive amounts of unstructured data such as text, images, videos, and documents."
            ),
            Question(
                id = 4,
                questionText = "What is the main feature of Azure Availability Zones?",
                options = listOf(
                    "Centralized service management",
                    "Physical and logical separation for high availability",
                    "Reduced operational costs",
                    "Automated cost allocation"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Availability Zones provide physical and logical separation — each zone is a separate datacenter within a region, protecting applications from datacenter-level failures."
            ),
            Question(
                id = 5,
                questionText = "Which Azure service is primarily used for building serverless applications?",
                options = listOf(
                    "Azure Functions",
                    "Azure Virtual Machines",
                    "Azure DevOps",
                    "Azure Blob Storage"
                ),
                correctAnswerIndex = 0,
                explanation = "Azure Functions is the primary serverless compute service in Azure — it lets you run event-driven code without managing infrastructure."
            ),
            Question(
                id = 6,
                questionText = "What does PaaS primarily provide?",
                options = listOf(
                    "Control over operating systems",
                    "A platform to build, deploy, and manage applications",
                    "Management of physical hardware",
                    "Direct user access to hardware resources"
                ),
                correctAnswerIndex = 1,
                explanation = "PaaS provides a platform to build, deploy, and manage applications. The provider manages the underlying infrastructure, OS, and runtime so developers focus on code."
            ),
            Question(
                id = 7,
                questionText = "Which of the following is an example of a public cloud deployment?",
                options = listOf(
                    "A private cloud within a company",
                    "Azure services available to all users over the internet",
                    "A hybrid solution with both on-premises and cloud components",
                    "Dedicated cloud servers for a specific organization"
                ),
                correctAnswerIndex = 1,
                explanation = "A public cloud is owned and operated by a third-party provider (like Microsoft Azure) and delivers services over the internet to the general public."
            ),
            Question(
                id = 8,
                questionText = "What is the key benefit of using Azure Resource Groups?",
                options = listOf(
                    "Unified billing across services",
                    "Logical grouping of resources for easier management",
                    "Deployment only in specific regions",
                    "Reduced data redundancy"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Resource Groups provide a logical container for grouping related resources, making it easier to manage, deploy, monitor, and delete them as a unit."
            ),
            Question(
                id = 9,
                questionText = "Azure Table Storage is best used for:",
                options = listOf(
                    "Relational database systems",
                    "NoSQL key-value pair storage",
                    "Image and video storage",
                    "File storage"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Table Storage is a NoSQL key-value store suitable for storing large amounts of structured, non-relational data using a schema-less design."
            ),
            Question(
                id = 10,
                questionText = "Which pricing model in Azure helps reduce costs for consistent workloads?",
                options = listOf(
                    "Pay-as-you-go",
                    "Reserved instances",
                    "Spot pricing",
                    "Free tier"
                ),
                correctAnswerIndex = 1,
                explanation = "Reserved Instances allow you to commit to a 1 or 3 year term for consistent workloads, offering significant discounts (up to 72%) compared to pay-as-you-go pricing."
            )
        )
    )
    // ── QUIZ 8: Azure Storage Services ───────────────────────────────
    private val azureStorageQuiz = Quiz(
        id = "azure_storage_week8",
        title = "Azure Storage Services",
        description = "Week 8 – Azure Storage, Redundancy, Blobs, Files & Migration",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What does an Azure Storage Account provide?",
                options = listOf(
                    "A virtual machine environment for running applications",
                    "A unique namespace for Azure Storage data accessible from anywhere over HTTP or HTTPS",
                    "A dedicated physical server for storing files",
                    "A DNS zone for managing domain names"
                ),
                correctAnswerIndex = 1,
                explanation = "An Azure Storage Account provides a unique namespace for your data that is accessible from anywhere in the world over HTTP or HTTPS, and is secure, highly available, durable, and scalable."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is NOT a redundancy option in Azure Storage?",
                options = listOf(
                    "Locally Redundant Storage (LRS)",
                    "Geo-Redundant Storage (GRS)",
                    "Zone-Redundant Storage (ZRS)",
                    "Server-Redundant Storage (SRS)"
                ),
                correctAnswerIndex = 3,
                explanation = "Server-Redundant Storage (SRS) does not exist. The valid Azure redundancy options are LRS, GRS, RA-GRS, ZRS, GZRS, and RA-GZRS."
            ),
            Question(
                id = 3,
                questionText = "What does Locally Redundant Storage (LRS) do?",
                options = listOf(
                    "Replicates data across two geographic regions",
                    "Replicates data three times within a single datacenter in the primary region",
                    "Replicates data across multiple availability zones",
                    "Provides read access to data in a secondary region"
                ),
                correctAnswerIndex = 1,
                explanation = "LRS replicates your data three times within a single physical location (datacenter) in the primary region — the lowest-cost redundancy option."
            ),
            Question(
                id = 4,
                questionText = "What is the key advantage of Zone-Redundant Storage (ZRS) over LRS?",
                options = listOf(
                    "ZRS is cheaper than LRS",
                    "ZRS replicates data across three availability zones in the primary region for higher availability",
                    "ZRS stores data in two geographic regions",
                    "ZRS provides read access to a secondary region"
                ),
                correctAnswerIndex = 1,
                explanation = "ZRS replicates data synchronously across three availability zones in the primary region, protecting against datacenter-level failures — providing higher availability than LRS."
            ),
            Question(
                id = 5,
                questionText = "What does Geo-Redundant Storage (GRS) provide that LRS does not?",
                options = listOf(
                    "Faster read speeds within the primary region",
                    "Replication of data to a secondary geographic region to protect against regional disasters",
                    "Read access to replicated data in the secondary region at all times",
                    "Replication across three availability zones"
                ),
                correctAnswerIndex = 1,
                explanation = "GRS replicates data to a secondary geographic region far from the primary region, providing protection against regional disasters — something LRS cannot offer."
            ),
            Question(
                id = 6,
                questionText = "What additional capability does Read-Access Geo-Redundant Storage (RA-GRS) add over GRS?",
                options = listOf(
                    "Faster write speeds in the primary region",
                    "Replication across more availability zones",
                    "Read access to the replicated data in the secondary region even when the primary region is available",
                    "Lower storage costs compared to GRS"
                ),
                correctAnswerIndex = 2,
                explanation = "RA-GRS adds read access to data in the secondary region at any time, not just when the primary region is unavailable — unlike standard GRS."
            ),
            Question(
                id = 7,
                questionText = "What type of data is Azure Blob Storage designed to store?",
                options = listOf(
                    "Structured relational data only",
                    "Unstructured data such as text or binary data",
                    "Virtual machine disk images only",
                    "Key-value pairs for NoSQL databases"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Blob Storage is an object storage solution for unstructured data — it has no restrictions on the kinds of data it can hold, including text, binary data, images, and videos."
            ),
            Question(
                id = 8,
                questionText = "Which of the following is an ideal use case for Azure Blob Storage?",
                options = listOf(
                    "Running a relational SQL database",
                    "Hosting a Windows file share for an office",
                    "Streaming video and audio content",
                    "Sending messages between application components"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Blob Storage is ideal for streaming video and audio, serving images to browsers, storing files for distributed access, backup and restore, and archiving."
            ),
            Question(
                id = 9,
                questionText = "Which Blob Storage tier is optimized for frequently accessed data?",
                options = listOf(
                    "Cool access tier",
                    "Archive access tier",
                    "Cold access tier",
                    "Hot access tier"
                ),
                correctAnswerIndex = 3,
                explanation = "The Hot access tier is optimized for data that is accessed frequently, such as images for a website. It has higher storage costs but lower access costs."
            ),
            Question(
                id = 10,
                questionText = "What is the minimum storage duration for data in the Cool access tier?",
                options = listOf(
                    "7 days",
                    "30 days",
                    "90 days",
                    "180 days"
                ),
                correctAnswerIndex = 1,
                explanation = "The Cool access tier is optimized for infrequently accessed data stored for at least 30 days, such as customer invoices."
            ),
            Question(
                id = 11,
                questionText = "Which Blob Storage tier is most appropriate for long-term backups with flexible latency requirements?",
                options = listOf(
                    "Hot access tier",
                    "Cool access tier",
                    "Cold access tier",
                    "Archive access tier"
                ),
                correctAnswerIndex = 3,
                explanation = "The Archive access tier is for rarely accessed data stored for at least 180 days. It offers the lowest storage cost but the highest cost to rehydrate and access data."
            ),
            Question(
                id = 12,
                questionText = "Which access tiers can be set at the storage account level?",
                options = listOf(
                    "Hot and Cool only",
                    "Hot, Cool, and Cold",
                    "All four tiers including Archive",
                    "Archive and Cold only"
                ),
                correctAnswerIndex = 0,
                explanation = "Only Hot and Cool access tiers can be set at the account level. Cold and Archive tiers are not available at the account level but can be set at the blob level."
            ),
            Question(
                id = 13,
                questionText = "What protocol does Azure Files use to provide fully managed cloud file shares?",
                options = listOf(
                    "FTP and SFTP only",
                    "HTTP and HTTPS only",
                    "Server Message Block (SMB) or Network File System (NFS)",
                    "iSCSI and Fibre Channel"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Files offers fully managed file shares accessible via industry-standard SMB or NFS protocols, making them compatible with Windows, Linux, and macOS clients."
            ),
            Question(
                id = 14,
                questionText = "What is Azure File Sync used for?",
                options = listOf(
                    "Migrating databases from on-premises to Azure SQL",
                    "Centralizing file shares in Azure Files while keeping the flexibility of a Windows file server",
                    "Synchronizing virtual machine images across regions",
                    "Copying blobs between storage accounts"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure File Sync lets you centralize file shares in Azure Files while maintaining the flexibility, performance, and compatibility of a Windows file server — bi-directionally synced."
            ),
            Question(
                id = 15,
                questionText = "What is AzCopy?",
                options = listOf(
                    "A GUI tool for managing Azure Storage resources",
                    "A command-line utility for copying blobs or files to or from an Azure storage account",
                    "A service for migrating on-premises servers to Azure VMs",
                    "A tool for syncing Windows file servers with Azure Files"
                ),
                correctAnswerIndex = 1,
                explanation = "AzCopy is a command-line utility that you can use to copy blobs or files to or from your Azure storage account, supporting both upload and download operations."
            ),
            Question(
                id = 16,
                questionText = "What is Azure Storage Explorer?",
                options = listOf(
                    "A command-line tool for copying files to Azure",
                    "A standalone app that provides a graphical interface to manage Azure Storage resources",
                    "A migration service for moving on-premises data to Azure",
                    "A monitoring tool for tracking storage account costs"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Storage Explorer is a standalone app with a graphical user interface to manage Azure Storage resources — making it easy to work with blobs, files, queues, and tables."
            ),
            Question(
                id = 17,
                questionText = "What is Azure Migrate primarily used for?",
                options = listOf(
                    "Copying files between Azure storage accounts",
                    "Monitoring the performance of Azure VMs",
                    "Helping organizations migrate from on-premises environments to the Azure cloud",
                    "Syncing file servers with Azure Files"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Migrate is a hub service that helps you assess and migrate your on-premises datacenter to Azure, providing unified migration platform, tools, and assessment capabilities."
            ),
            Question(
                id = 18,
                questionText = "What is Azure Data Box used for?",
                options = listOf(
                    "Real-time streaming of data to Azure Event Hubs",
                    "Moving large amounts of data to Azure when network transfer is impractical, using a physical device",
                    "Providing read access to geo-replicated storage",
                    "Caching frequently accessed blobs closer to users"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Data Box is a physical device Microsoft ships to you for transferring large amounts of data to Azure when uploading over the network is too slow or impractical."
            ),
            Question(
                id = 19,
                questionText = "Which Azure storage service is best suited for sending messages between application components?",
                options = listOf(
                    "Azure Blob Storage",
                    "Azure Files",
                    "Azure Queue Storage",
                    "Azure Table Storage"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Queue Storage is designed for storing large numbers of messages that can be accessed from anywhere, making it ideal for decoupling application components."
            ),
            Question(
                id = 20,
                questionText = "Which of the following is a key benefit of Azure Blob Storage over traditional disk storage?",
                options = listOf(
                    "Blob storage requires developers to manage physical disks",
                    "Blob storage is limited to common file formats only",
                    "Developers don't need to think about or manage disks — Azure handles physical storage",
                    "Blob storage can only be accessed within a single Azure region"
                ),
                correctAnswerIndex = 2,
                explanation = "A key advantage of Blob Storage over disk storage is that developers don't need to manage disks. Data is uploaded as blobs and Azure takes care of all physical storage needs."
            )
        )
    )

    // ── QUIZ 9: Azure IoT Hub ─────────────────────────────────────────
    private val azureIoTQuiz = Quiz(
        id = "azure_iot_week9",
        title = "Azure IoT Hub",
        description = "Week 9 – Azure IoT Hub, Device Management & Telemetry",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is Azure IoT Hub?",
                options = listOf(
                    "A file storage service for IoT device logs",
                    "A managed cloud service that acts as a central message hub between IoT applications and devices",
                    "A virtual machine service for running IoT applications",
                    "A DNS service for resolving IoT device names"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub is a managed cloud service that acts as a central message hub for bidirectional communication between IoT applications and the devices they manage."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is a benefit of Azure IoT Hub?",
                options = listOf(
                    "It can only connect a maximum of 100 devices",
                    "It allows you to send commands to devices and route device data",
                    "It replaces the need for any cloud storage services",
                    "It only works with Microsoft-manufactured IoT devices"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub allows you to route device data and send commands back to devices — two of its key benefits for managing IoT solutions at scale."
            ),
            Question(
                id = 3,
                questionText = "What does 'Scale your solution' mean as a benefit of Azure IoT Hub?",
                options = listOf(
                    "IoT Hub automatically reduces device connections when not needed",
                    "IoT Hub supports millions of simultaneously connected devices and massive event ingestion",
                    "IoT Hub scales down costs by removing unused devices",
                    "IoT Hub replicates data across regions automatically"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub can scale to support millions of simultaneously connected devices and millions of events per second, making it suitable for large-scale IoT deployments."
            ),
            Question(
                id = 4,
                questionText = "What is the Device Identity Registry in Azure IoT Hub?",
                options = listOf(
                    "A database storing device telemetry data",
                    "A storage file for device firmware updates",
                    "A built-in database that stores identities of devices allowed to connect to IoT Hub",
                    "A DNS registry mapping device names to IP addresses"
                ),
                correctAnswerIndex = 2,
                explanation = "The Device Identity Registry is a built-in database in IoT Hub that stores the identities of all devices permitted to connect, used for authentication and access control."
            ),
            Question(
                id = 5,
                questionText = "What is a Device Twin in Azure IoT Hub?",
                options = listOf(
                    "A backup copy of a physical IoT device",
                    "A JSON document that stores device state information such as metadata, configurations, and conditions",
                    "A duplicate IoT Hub for disaster recovery",
                    "A secondary communication channel between two IoT devices"
                ),
                correctAnswerIndex = 1,
                explanation = "A Device Twin is a JSON document associated with each device that stores state information including metadata, configurations, and conditions — used to sync state between IoT Hub and devices."
            ),
            Question(
                id = 6,
                questionText = "Which communication protocols does Azure IoT Hub support?",
                options = listOf(
                    "Only HTTP and HTTPS",
                    "Only Bluetooth and Zigbee",
                    "MQTT, AMQP, and HTTPS",
                    "Only WebSockets and gRPC"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure IoT Hub supports MQTT, AMQP, and HTTPS protocols, enabling a wide variety of devices to connect regardless of their hardware or network constraints."
            ),
            Question(
                id = 7,
                questionText = "What is the telemetry function in Azure IoT Hub?",
                options = listOf(
                    "Sending firmware updates to devices",
                    "Receiving data sent from devices to the cloud for monitoring and analysis",
                    "Configuring device security certificates",
                    "Managing device twin properties"
                ),
                correctAnswerIndex = 1,
                explanation = "The telemetry function enables IoT Hub to receive data sent from devices (such as sensor readings, temperature, location) to the cloud for processing and analysis."
            ),
            Question(
                id = 8,
                questionText = "What does Azure IoT Hub Device Provisioning Service (DPS) do?",
                options = listOf(
                    "Stores device telemetry data in Azure Blob Storage",
                    "Enables zero-touch, just-in-time provisioning of devices to the right IoT Hub without human intervention",
                    "Provides DNS resolution for IoT devices",
                    "Monitors device battery levels and connectivity"
                ),
                correctAnswerIndex = 1,
                explanation = "The Device Provisioning Service (DPS) enables zero-touch, just-in-time device provisioning to the correct IoT Hub without requiring manual intervention for each device."
            ),
            Question(
                id = 9,
                questionText = "What is meant by 'bidirectional communication' in the context of Azure IoT Hub?",
                options = listOf(
                    "Data can only flow from devices to the cloud",
                    "Data can only flow from the cloud to devices",
                    "Data can flow both from devices to the cloud AND from the cloud back to devices",
                    "Two IoT Hubs communicate with each other"
                ),
                correctAnswerIndex = 2,
                explanation = "Bidirectional communication means IoT Hub supports both device-to-cloud messaging (telemetry) and cloud-to-device messaging (sending commands or configurations back to devices)."
            ),
            Question(
                id = 10,
                questionText = "Which Azure IoT Hub benefit specifically addresses protecting data sent between devices and the cloud?",
                options = listOf(
                    "Scale your solution",
                    "Route device data",
                    "Secure your communications",
                    "Connect virtually any device"
                ),
                correctAnswerIndex = 2,
                explanation = "The 'Secure your communications' benefit covers per-device security keys and X.509 certificate authentication to protect data flowing between devices and the cloud."
            ),
            Question(
                id = 11,
                questionText = "How does Azure IoT Hub help with monitoring your IoT solution?",
                options = listOf(
                    "It replaces your device hardware with cloud instances",
                    "It tracks events such as device creation, device failures, and device connections",
                    "It automatically repairs broken IoT devices remotely",
                    "It reduces network bandwidth by compressing device data"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub provides monitoring capabilities by tracking events such as device creation, device failures, and device connections, helping you maintain solution health."
            ),
            Question(
                id = 12,
                questionText = "What does 'Route device data' mean as an IoT Hub capability?",
                options = listOf(
                    "Physically relocating IoT devices to different locations",
                    "Directing device messages to different Azure services based on defined rules",
                    "Mapping device IP addresses to domain names",
                    "Distributing firmware updates to multiple devices simultaneously"
                ),
                correctAnswerIndex = 1,
                explanation = "Message routing in IoT Hub allows you to direct device messages to different Azure services (like Storage, Event Hubs, or Service Bus) based on rules you define."
            ),
            Question(
                id = 13,
                questionText = "Which of the following is a key challenge that Azure IoT Hub addresses in large-scale IoT deployments?",
                options = listOf(
                    "Running machine learning models on individual IoT devices",
                    "Securely connecting, managing, and receiving data from millions of IoT devices",
                    "Replacing physical network infrastructure with virtual networks",
                    "Providing a GUI for end users to interact with IoT devices"
                ),
                correctAnswerIndex = 1,
                explanation = "The core challenge IoT Hub addresses is securely connecting, managing, and ingesting data from massive numbers of IoT devices in a scalable, reliable way."
            ),
            Question(
                id = 14,
                questionText = "What type of authentication does Azure IoT Hub support for devices?",
                options = listOf(
                    "Username and password only",
                    "Per-device security keys and X.509 certificates",
                    "OAuth tokens only",
                    "IP address whitelisting only"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub supports per-device security keys and X.509 certificate authentication, ensuring that only authorized devices can connect to the hub."
            ),
            Question(
                id = 15,
                questionText = "What does 'Connect virtually any device' mean as a benefit of Azure IoT Hub?",
                options = listOf(
                    "IoT Hub can physically manufacture any type of IoT sensor",
                    "IoT Hub supports multiple protocols and SDKs, enabling devices of many types and manufacturers to connect",
                    "IoT Hub replaces the operating system on connected devices",
                    "IoT Hub only supports the latest generation of IoT hardware"
                ),
                correctAnswerIndex = 1,
                explanation = "By supporting multiple protocols (MQTT, AMQP, HTTPS) and providing SDKs for many languages and platforms, IoT Hub can connect virtually any device regardless of type or manufacturer."
            ),
            Question(
                id = 16,
                questionText = "What are the endpoints that IoT Hub exposes used for?",
                options = listOf(
                    "Providing physical access ports on IoT devices",
                    "Connecting IoT Hub to external services and applications for sending and receiving messages",
                    "Assigning IP addresses to connected devices",
                    "Storing device firmware in a retrievable location"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Hub exposes endpoints that applications and services use to send and receive messages — including built-in endpoints and custom routing endpoints to other Azure services."
            ),
            Question(
                id = 17,
                questionText = "Which scenario is Azure IoT Hub MOST suited for?",
                options = listOf(
                    "Hosting a static website with global distribution",
                    "Collecting and processing telemetry from thousands of sensors in real time",
                    "Running containerized microservices at scale",
                    "Storing and querying large relational databases"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub is specifically designed for IoT scenarios — collecting and processing real-time telemetry from large numbers of sensors and devices."
            ),
            Question(
                id = 18,
                questionText = "How does Azure IoT Hub help create highly available and resilient IoT solutions?",
                options = listOf(
                    "By storing all device data on a single server for simplicity",
                    "By providing built-in failover, redundancy, and the ability to recover from failures automatically",
                    "By limiting the number of connected devices to reduce risk",
                    "By requiring all devices to be physically co-located in one datacenter"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Hub is built with high availability in mind, providing failover support, redundancy, and resilience features to ensure your IoT solution keeps running during failures."
            ),
            Question(
                id = 19,
                questionText = "What is the purpose of 'Manage and configure your devices' as an IoT Hub benefit?",
                options = listOf(
                    "Physical replacement of faulty IoT hardware",
                    "Remotely update device firmware, properties, and configurations from the cloud without physical access",
                    "Automatically purchase new IoT devices when stock runs low",
                    "Physically install software on each device at the factory"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Hub allows you to manage and configure devices remotely from the cloud — updating firmware, adjusting settings, and changing configurations without needing physical access to each device."
            ),
            Question(
                id = 20,
                questionText = "What is the main difference between Azure IoT Hub and a simple messaging service?",
                options = listOf(
                    "IoT Hub can only send messages in one direction",
                    "IoT Hub is specifically designed for IoT with device identity management, security, scaling to millions of devices, and device twin support",
                    "A messaging service supports more protocols than IoT Hub",
                    "IoT Hub does not support integration with other Azure services"
                ),
                correctAnswerIndex = 1,
                explanation = "Unlike a generic messaging service, IoT Hub is purpose-built for IoT with features like device identity registry, per-device authentication, device twins, and the ability to scale to millions of devices."
            )
        )
    )

    // ── QUIZ 10: Azure IoT Services ──────────────────────────────────
    private val azureIoTServicesQuiz = Quiz(
        id = "azure_iot_services_week10",
        title = "Azure IoT Services",
        description = "Week 10 – Azure IoT Central, Edge, Sphere, Digital Twins & More",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is an IoT device typically made up of?",
                options = listOf(
                    "A full desktop computer with a keyboard and monitor",
                    "A circuit board with sensors that uses WiFi to connect to the internet",
                    "A cloud virtual machine running sensor software",
                    "A physical server rack installed on-premises"
                ),
                correctAnswerIndex = 1,
                explanation = "An IoT device is typically made up of a circuit board with sensors attached that uses WiFi to connect to the internet — examples include temperature sensors, accelerometers, and pressure sensors."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is an example of device-to-cloud communication?",
                options = listOf(
                    "A cloud service sending a command to put a coffee machine into maintenance mode",
                    "A cloud service setting the target temperature for a thermostat",
                    "A connected coffee machine sending water temperature every minute to IoT Hub",
                    "A cloud service pushing a firmware update to a device"
                ),
                correctAnswerIndex = 2,
                explanation = "Device-to-cloud communication involves devices sending data to the cloud — such as a coffee machine sending its water temperature readings every minute to IoT Hub."
            ),
            Question(
                id = 3,
                questionText = "Which of the following is an example of cloud-to-device communication?",
                options = listOf(
                    "A thermostat reporting its maximum temperature since last reboot",
                    "A sensor sending an alert when temperature exceeds a threshold",
                    "A device sending telemetry from attached sensors to IoT Hub",
                    "A cloud service sending a command to put a coffee machine into maintenance mode"
                ),
                correctAnswerIndex = 3,
                explanation = "Cloud-to-device communication involves the cloud sending instructions back to devices — such as a cloud service commanding a coffee machine to enter maintenance mode."
            ),
            Question(
                id = 4,
                questionText = "What is Azure IoT Central?",
                options = listOf(
                    "A hardware device for connecting sensors to the internet",
                    "A managed app platform that reduces the burden of developing, managing, and maintaining IoT solutions",
                    "A cloud storage service for IoT telemetry data",
                    "A physical IoT gateway device installed on-premises"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Central is a managed app platform that reduces the cost and complexity of developing IoT solutions, offering a web UI to connect devices, monitor conditions, create rules, and manage devices."
            ),
            Question(
                id = 5,
                questionText = "What is Azure IoT Edge used for?",
                options = listOf(
                    "Providing a web UI for managing IoT devices",
                    "Offloading IoT workloads from the Azure cloud to devices to reduce latency and data exchange",
                    "Storing large volumes of IoT telemetry in the cloud",
                    "Provisioning devices automatically to the right IoT Hub"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Edge lets you offload parts of your IoT workload from the cloud to devices themselves, reducing latency, reducing cloud data exchange, and enabling offline scenarios."
            ),
            Question(
                id = 6,
                questionText = "What is Azure Digital Twins?",
                options = listOf(
                    "A service that creates duplicate IoT Hub instances for redundancy",
                    "A service that lets you model physical environments using a spatial intelligence graph to represent relationships between people, spaces, and devices",
                    "A backup service for IoT device firmware",
                    "A tool for managing duplicate device identities in IoT Hub"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Digital Twins bridges the physical and digital worlds by letting you model physical environments with a spatial intelligence graph, correlating data to create contextually aware solutions."
            ),
            Question(
                id = 7,
                questionText = "What is Azure Sphere?",
                options = listOf(
                    "A geospatial mapping service for IoT device locations",
                    "A serverless function service triggered by IoT device events",
                    "A secured, high-level application platform with built-in communication and security features for internet-connected devices",
                    "A cloud analytics service for processing time series IoT data"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Sphere is a secured platform for internet-connected devices that includes a secured microcontroller unit, a custom Linux-based OS, and a cloud-based security service providing continuous, renewable security."
            ),
            Question(
                id = 8,
                questionText = "What are the three components that make up Azure Sphere?",
                options = listOf(
                    "IoT Hub, DPS, and IoT Central",
                    "A secured microcontroller unit, a custom Linux-based OS, and a cloud-based security service",
                    "IoT Edge, Digital Twins, and Azure Maps",
                    "Azure Functions, Event Hub, and Azure Storage"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Sphere consists of three components: a secured microcontroller unit (MCU), a custom Linux-based operating system, and a cloud-based security service providing continuous security."
            ),
            Question(
                id = 9,
                questionText = "Which Azure service is used to analyze large amounts of time series data such as temperature readings from IoT sensors?",
                options = listOf(
                    "Azure Blob Storage",
                    "Azure Digital Twins",
                    "Azure Data Explorer",
                    "Azure IoT Central"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Data Explorer is designed to analyze large amounts of time series data — it can connect to an IoT hub, read the telemetry stream, store data, and enable querying and visualization."
            ),
            Question(
                id = 10,
                questionText = "What is Azure Maps used for in an IoT solution?",
                options = listOf(
                    "Routing messages between IoT devices and the cloud",
                    "Providing geospatial services and mapping data for geographic context in applications",
                    "Provisioning devices to the correct IoT Hub automatically",
                    "Analyzing time series data from IoT sensors"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Maps is a collection of geospatial services providing fresh mapping data and geographic context — for example, building a visualization showing the location of connected coffee machines."
            ),
            Question(
                id = 11,
                questionText = "How can Azure Functions be used in an IoT solution?",
                options = listOf(
                    "To store telemetry data from devices in blob storage",
                    "To model physical environments with digital twins",
                    "To automate actions and notifications based on device data — such as sending an email when a device reports a critical condition",
                    "To provision devices at scale using zero-touch enrollment"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Functions can be triggered by IoT device data to automate actions — for example, sending an email or text message when a connected coffee machine reports a critical condition."
            ),
            Question(
                id = 12,
                questionText = "What does device developer code typically do in an Azure IoT solution?",
                options = listOf(
                    "Manages the cloud infrastructure and Azure resource groups",
                    "Establishes secure cloud connections, sends telemetry, manages device state, and responds to cloud commands",
                    "Configures network security groups and virtual networks",
                    "Builds the web dashboard for visualizing IoT data"
                ),
                correctAnswerIndex = 1,
                explanation = "Device developer code typically: establishes secure connections to cloud endpoints, sends telemetry from sensors, manages and syncs device state, responds to commands, and enables firmware updates."
            ),
            Question(
                id = 13,
                questionText = "What are the two ways a device can establish a secure connection to an IoT Hub?",
                options = listOf(
                    "Via Bluetooth or via NFC",
                    "Directly using a connection string, or indirectly via the Device Provisioning Service (DPS)",
                    "Via Azure Active Directory or via Azure Key Vault",
                    "Via IoT Central or via Azure Digital Twins"
                ),
                correctAnswerIndex = 1,
                explanation = "A device can connect directly to IoT Hub using a connection string (hostname), or indirectly via DPS where it retrieves the correct IoT Hub connection string automatically."
            ),
            Question(
                id = 14,
                questionText = "What are the three security areas in an IoT solution?",
                options = listOf(
                    "Device security, network security, and application security",
                    "Device security, connection security, and cloud security",
                    "Hardware security, software security, and firmware security",
                    "Authentication, authorization, and encryption"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT solution security is divided into three areas: Device security (securing the device in the field), Connection security (securing data in transit), and Cloud security (securing data in the cloud)."
            ),
            Question(
                id = 15,
                questionText = "What does 'message processing' refer to in the context of Azure IoT?",
                options = listOf(
                    "Writing device firmware to process sensor readings locally",
                    "Routing and enriching telemetry messages sent by devices to control message flow and add information",
                    "Compressing device data before sending it to the cloud",
                    "Deleting old messages from the IoT Hub message queue"
                ),
                correctAnswerIndex = 1,
                explanation = "Message processing in Azure IoT refers to routing and enriching telemetry messages from devices — controlling the flow of messages through the solution and adding additional context or information."
            ),
            Question(
                id = 16,
                questionText = "How can Azure IoT solutions be scaled to support millions of connected devices?",
                options = listOf(
                    "By purchasing more physical servers in an on-premises datacenter",
                    "By limiting the number of messages each device can send per day",
                    "By using DPS for zero-touch provisioning at scale, IoT Hub vertical/horizontal scaling, and IoT Edge to offload processing",
                    "By replacing all IoT devices with more powerful hardware"
                ),
                correctAnswerIndex = 2,
                explanation = "Scalability in Azure IoT is achieved through DPS for large-scale provisioning, scaling IoT Hub vertically and horizontally, using Device Update for over-the-air updates, and IoT Edge to offload processing to devices."
            ),
            Question(
                id = 17,
                questionText = "What are the three factors that determine how to use Azure IoT to build a solution?",
                options = listOf(
                    "Budget, timeline, and team size",
                    "Business requirements, type of solution, and your organization's skill set in Azure IoT technologies",
                    "Number of devices, data volume, and network speed",
                    "Region, subscription type, and compliance requirements"
                ),
                correctAnswerIndex = 1,
                explanation = "The decision of how to use Azure IoT is determined by your business requirements, the type of solution you want to develop, and your organization's skill set in Azure IoT technologies."
            ),
            Question(
                id = 18,
                questionText = "What is the role of cloud services in an IoT solution?",
                options = listOf(
                    "To physically manufacture IoT sensors and devices",
                    "To receive telemetry, analyze data, send commands, provision devices, manage firmware, and control device state",
                    "To replace the need for any on-premises networking infrastructure",
                    "To provide a graphical interface for users to manually control each device"
                ),
                correctAnswerIndex = 1,
                explanation = "Cloud services in an IoT solution receive telemetry at scale, analyze it for insights, send commands to devices, provision devices, manage firmware, and control and monitor device state."
            ),
            Question(
                id = 19,
                questionText = "Which tool can be used to automate the management of an Azure IoT solution from a command line?",
                options = listOf(
                    "Azure IoT Central web UI only",
                    "PowerShell or the Azure CLI",
                    "Azure Storage Explorer",
                    "Azure Digital Twins Explorer"
                ),
                correctAnswerIndex = 1,
                explanation = "You can use PowerShell or the Azure CLI to automate the management of your IoT solution from a command line environment, in addition to the Azure portal and ARM templates."
            ),
            Question(
                id = 20,
                questionText = "What is a key benefit of using IoT Edge to scale an IoT solution?",
                options = listOf(
                    "IoT Edge stores all telemetry permanently in the cloud",
                    "IoT Edge moves cloud analytics and custom business logic to devices, letting the cloud focus on business insights instead of data management",
                    "IoT Edge replaces the need for IoT Hub entirely",
                    "IoT Edge automatically provisions new devices using zero-touch enrollment"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge helps scale solutions by moving analytics and business logic from the cloud to devices — reducing cloud data load and allowing the cloud to focus on high-level business insights rather than raw data management."
            )
        )
    )

    // ── QUIZ 11: Azure Stream Analytics ──────────────────────────────
    private val azureStreamAnalyticsQuiz = Quiz(
        id = "azure_stream_analytics_week11",
        title = "Azure Stream Analytics",
        description = "Week 11 – Azure Stream Analytics, IoT Edge Jobs & Real-Time Processing",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is Azure Stream Analytics?",
                options = listOf(
                    "A batch processing service for analyzing historical data stored in Azure Blob Storage",
                    "A fully managed stream processing engine designed to analyze large volumes of streaming data with sub-millisecond latencies",
                    "A relational database service for storing IoT telemetry",
                    "A visualization tool for displaying IoT device dashboards"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Stream Analytics is a fully managed stream processing engine designed to analyze and process large volumes of streaming data with sub-millisecond latencies."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is a supported input source for Azure Stream Analytics?",
                options = listOf(
                    "Azure Blob Storage only",
                    "Relational databases only",
                    "Applications, devices, sensors, clickstreams, and social media feeds",
                    "Only Azure Virtual Machines"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Stream Analytics can process data from a variety of input sources including applications, devices, sensors, clickstreams, and social media feeds."
            ),
            Question(
                id = 3,
                questionText = "What can patterns and relationships identified by Azure Stream Analytics be used for?",
                options = listOf(
                    "Only storing data in Azure Table Storage",
                    "Triggering actions such as creating alerts, feeding reporting tools, or storing transformed data",
                    "Replacing IoT Hub for device communication",
                    "Provisioning new IoT devices automatically"
                ),
                correctAnswerIndex = 1,
                explanation = "Identified patterns can trigger actions and workflows such as creating alerts, feeding information to a reporting tool, or storing transformed data for later use."
            ),
            Question(
                id = 4,
                questionText = "Where else, besides the Azure cloud, can Stream Analytics be run?",
                options = listOf(
                    "On-premises SQL servers",
                    "Azure Kubernetes Service only",
                    "On the Azure IoT Edge runtime, directly on IoT devices",
                    "Inside Azure Virtual Machines only"
                ),
                correctAnswerIndex = 2,
                explanation = "Stream Analytics is available on the Azure IoT Edge runtime, enabling data processing directly on IoT devices rather than only in the cloud."
            ),
            Question(
                id = 5,
                questionText = "What are Stream Analytics Edge jobs composed of?",
                options = listOf(
                    "A storage account and a virtual network",
                    "A cloud part for job definition and a module running on IoT devices containing the Stream Analytics engine",
                    "An IoT Hub and an Azure Functions instance",
                    "A Docker container registry and a Kubernetes cluster"
                ),
                correctAnswerIndex = 1,
                explanation = "Edge jobs consist of two parts: a cloud part where users define inputs, outputs, and queries, and a module running on IoT devices that contains the Stream Analytics engine."
            ),
            Question(
                id = 6,
                questionText = "How does Azure Stream Analytics deploy edge jobs to devices?",
                options = listOf(
                    "Using Azure Blob Storage file transfers",
                    "Via direct USB connection to each device",
                    "Using IoT Hub to deploy edge jobs to devices",
                    "Through Azure Active Directory push policies"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Stream Analytics uses IoT Hub to deploy edge jobs to IoT Edge devices, leveraging IoT Hub's device management and deployment capabilities."
            ),
            Question(
                id = 7,
                questionText = "Which of the following is a limitation of Stream Analytics Edge jobs compared to cloud jobs?",
                options = listOf(
                    "Edge jobs cannot process JSON format data",
                    "Edge jobs do not support any SQL query language features",
                    "User-defined functions (UDFs) in JavaScript are not supported for edge jobs",
                    "Edge jobs cannot connect to IoT Hub as an input source"
                ),
                correctAnswerIndex = 2,
                explanation = "User-defined functions (UDF) in JavaScript are not supported for edge jobs. UDFs are available in C# for IoT Edge jobs (in preview), not JavaScript."
            ),
            Question(
                id = 8,
                questionText = "Which data formats are supported for input and output in Stream Analytics Edge jobs?",
                options = listOf(
                    "AVRO and Parquet only",
                    "XML and HTML only",
                    "CSV and JSON only",
                    "CSV, JSON, and AVRO"
                ),
                correctAnswerIndex = 2,
                explanation = "For Stream Analytics Edge jobs, only CSV and JSON formats are supported for input and output. AVRO format is NOT supported for edge jobs."
            ),
            Question(
                id = 9,
                questionText = "Which of the following SQL operators is NOT supported for Stream Analytics Edge jobs?",
                options = listOf(
                    "SELECT and WHERE",
                    "GROUP BY and HAVING",
                    "PARTITION BY",
                    "JOIN and UNION"
                ),
                correctAnswerIndex = 2,
                explanation = "PARTITION BY is one of the SQL operators not supported for Stream Analytics Edge jobs, along with GetMetadataPropertyValue and Late arrival policy."
            ),
            Question(
                id = 10,
                questionText = "What technology does Stream Analytics on IoT Edge use to provide a portable, cross-platform solution?",
                options = listOf(
                    "Azure Virtual Machines",
                    "Docker containers",
                    "Azure Kubernetes Service",
                    "VMware hypervisors"
                ),
                correctAnswerIndex = 1,
                explanation = "Stream Analytics and Azure IoT Edge use Docker containers to provide a portable solution that runs on multiple host operating systems including Windows and Linux."
            ),
            Question(
                id = 11,
                questionText = "Which processor architectures does Stream Analytics on IoT Edge support?",
                options = listOf(
                    "Only x86-64 architecture",
                    "Only ARM architecture",
                    "Only Intel x86 architecture",
                    "Both x86-64 and ARM (Advanced RISC Machines) architectures"
                ),
                correctAnswerIndex = 3,
                explanation = "Stream Analytics on IoT Edge is available as Windows and Linux images running on both x86-64 and ARM (Advanced RISC Machines) processor architectures."
            ),
            Question(
                id = 12,
                questionText = "Which of the following is a supported stream INPUT type for Stream Analytics Edge jobs?",
                options = listOf(
                    "SQL Database",
                    "Blob Storage",
                    "Edge Hub",
                    "Azure Data Explorer"
                ),
                correctAnswerIndex = 2,
                explanation = "Supported stream input types for Edge jobs are Edge Hub, Event Hub, and IoT Hub. SQL Database and Blob Storage are output types, not inputs."
            ),
            Question(
                id = 13,
                questionText = "Which of the following is a supported stream OUTPUT type for Stream Analytics Edge jobs?",
                options = listOf(
                    "IoT Hub",
                    "Azure Digital Twins",
                    "Azure Maps",
                    "SQL Database"
                ),
                correctAnswerIndex = 3,
                explanation = "Supported stream output types for Edge jobs include Edge Hub, SQL Database, Event Hub, and Blob Storage/ADLS Gen2. IoT Hub is an input type, not an output type."
            ),
            Question(
                id = 14,
                questionText = "What happens when you create an input or output stream in a Stream Analytics Edge job?",
                options = listOf(
                    "A new IoT Hub namespace is automatically created",
                    "A corresponding endpoint is created on your deployed module that can be used in deployment routes",
                    "A new Azure subscription is required for each stream",
                    "A virtual machine is automatically provisioned to handle the stream"
                ),
                correctAnswerIndex = 1,
                explanation = "For each input and output stream created in a Stream Analytics Edge job, a corresponding endpoint is created on the deployed module — these endpoints are used in deployment routes."
            ),
            Question(
                id = 15,
                questionText = "What is the key advantage of running Stream Analytics on IoT Edge rather than only in the cloud?",
                options = listOf(
                    "It provides higher storage capacity for IoT data",
                    "It allows processing data directly on IoT devices, reducing latency and cloud data exchange",
                    "It replaces the need for Azure IoT Hub entirely",
                    "It provides a graphical dashboard for device management"
                ),
                correctAnswerIndex = 1,
                explanation = "Running Stream Analytics on IoT Edge allows processing data directly on devices, reducing latency, reducing the amount of data exchanged with the cloud, and enabling offline scenarios."
            ),
            Question(
                id = 16,
                questionText = "What does 'sub-millisecond latency' mean in the context of Azure Stream Analytics?",
                options = listOf(
                    "Data is processed once per day in large batches",
                    "Data is stored first and processed within one hour",
                    "Streaming data can be analyzed and processed in less than one millisecond, enabling near real-time insights",
                    "Data is transmitted over a sub-1ms network connection"
                ),
                correctAnswerIndex = 2,
                explanation = "Sub-millisecond latency means Stream Analytics can process and analyze streaming data in under one millisecond, enabling near real-time pattern detection and action triggering."
            ),
            Question(
                id = 17,
                questionText = "What is the cloud part of a Stream Analytics Edge job responsible for?",
                options = listOf(
                    "Running the Stream Analytics engine on the device",
                    "Storing raw telemetry data from devices",
                    "Defining inputs, outputs, queries, and settings such as out-of-order event handling",
                    "Provisioning devices using DPS"
                ),
                correctAnswerIndex = 2,
                explanation = "The cloud part of an Edge job is responsible for the job definition — users define inputs, outputs, queries, and other settings like out-of-order event handling in the cloud."
            ),
            Question(
                id = 18,
                questionText = "Which Azure ML feature is NOT supported in Stream Analytics Edge jobs?",
                options = listOf(
                    "SQL GROUP BY queries",
                    "Azure ML functions",
                    "JSON input format",
                    "Event Hub as an input"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure ML functions are not supported for Stream Analytics Edge jobs. This is one of the key limitations of edge jobs compared to full cloud jobs."
            ),
            Question(
                id = 19,
                questionText = "What is a common real-world scenario for Azure Stream Analytics?",
                options = listOf(
                    "Storing static website content globally",
                    "Managing virtual machine scale sets",
                    "Real-time fraud detection by analyzing transaction streams and triggering alerts",
                    "Batch processing of monthly billing reports"
                ),
                correctAnswerIndex = 2,
                explanation = "A common Stream Analytics scenario is real-time fraud detection — analyzing streaming transaction data to identify suspicious patterns and immediately trigger alerts."
            ),
            Question(
                id = 20,
                questionText = "What requirement must be met to run Stream Analytics on IoT Edge?",
                options = listOf(
                    "Devices must be running Windows Server 2019 or later",
                    "Devices must have at least 16GB of RAM",
                    "Devices must be able to run Azure IoT Edge",
                    "Devices must be physically located in an Azure datacenter region"
                ),
                correctAnswerIndex = 2,
                explanation = "To run Stream Analytics on IoT Edge, you need devices that are capable of running Azure IoT Edge — the platform requirement for executing edge containerized workloads."
            )
        )
    )

    // ── QUIZ 12: Serverless Computing ────────────────────────────────
    private val serverlessComputingQuiz = Quiz(
        id = "serverless_computing_week14",
        title = "Serverless Computing",
        description = "Week 14 – Serverless Computing, Azure Functions & Patterns",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is the core idea behind serverless computing?",
                options = listOf(
                    "Running applications on dedicated physical servers owned by the developer",
                    "Abstracting infrastructure management so developers focus on writing code rather than managing servers",
                    "Deploying applications only on virtual machines managed by the developer",
                    "A computing model with no servers involved whatsoever"
                ),
                correctAnswerIndex = 1,
                explanation = "Serverless computing abstracts infrastructure management away from developers, allowing them to focus on writing code while the cloud provider handles all server provisioning, scaling, and maintenance."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is a benefit of serverless computing?",
                options = listOf(
                    "Full control over the operating system and hardware",
                    "Fixed monthly cost regardless of usage",
                    "No infrastructure management required",
                    "Guaranteed zero cold start times"
                ),
                correctAnswerIndex = 2,
                explanation = "A key benefit of serverless computing is no infrastructure management — developers don't need to provision, configure, or maintain servers, freeing them to focus on application code."
            ),
            Question(
                id = 3,
                questionText = "What does 'dynamic scalability' mean as a benefit of serverless computing?",
                options = listOf(
                    "You manually add more servers when traffic increases",
                    "The infrastructure automatically scales up or down based on demand without developer intervention",
                    "You pay a fixed cost for a pre-determined number of server instances",
                    "Scaling is limited to a maximum of 10 instances"
                ),
                correctAnswerIndex = 1,
                explanation = "Dynamic scalability in serverless means the platform automatically scales resources up or down in response to demand — no manual intervention or pre-provisioning required."
            ),
            Question(
                id = 4,
                questionText = "What is 'faster time to market' as a serverless benefit referring to?",
                options = listOf(
                    "Serverless applications deploy faster because they use smaller containers",
                    "Developers can build and deploy applications faster by not spending time managing infrastructure",
                    "Serverless functions execute faster than traditional server-based functions",
                    "Cloud providers guarantee faster network speeds for serverless apps"
                ),
                correctAnswerIndex = 1,
                explanation = "Faster time to market means developers spend less time on infrastructure setup and management, allowing them to focus on building features and ship applications more quickly."
            ),
            Question(
                id = 5,
                questionText = "What does 'more efficient use of resources' mean in serverless computing?",
                options = listOf(
                    "Serverless uses more CPU than traditional servers",
                    "You pay only for the compute time consumed when your code runs, not for idle server time",
                    "Serverless requires fewer developers to manage the application",
                    "Resources are shared across multiple cloud providers simultaneously"
                ),
                correctAnswerIndex = 1,
                explanation = "Serverless provides more efficient resource use because you only pay for the exact compute time your code consumes — unlike traditional servers that charge for idle time too."
            ),
            Question(
                id = 6,
                questionText = "Which of the following is a serverless application pattern?",
                options = listOf(
                    "Monolithic architecture pattern",
                    "Client-server pattern",
                    "Serverless API gateway",
                    "Multi-tier N-tier pattern"
                ),
                correctAnswerIndex = 2,
                explanation = "Serverless API gateway is one of the serverless application patterns. Others include serverless functions, serverless Kubernetes, serverless workflows, and serverless application environments."
            ),
            Question(
                id = 7,
                questionText = "What is Azure Functions?",
                options = listOf(
                    "A managed Kubernetes service for running containerized applications",
                    "A serverless solution allowing developers to write less code, maintain less infrastructure, and save on costs",
                    "A virtual machine service for running .NET applications",
                    "A managed database service for storing application data"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Functions is a serverless solution that allows developers to write less code, maintain less infrastructure, and save on costs — the cloud handles all server resources needed to run the application."
            ),
            Question(
                id = 8,
                questionText = "In Azure Functions, who is responsible for deploying and maintaining the servers?",
                options = listOf(
                    "The developer must configure and deploy servers manually",
                    "A dedicated DevOps team manages all server infrastructure",
                    "The cloud infrastructure handles all server provisioning and maintenance automatically",
                    "A third-party managed service provider"
                ),
                correctAnswerIndex = 2,
                explanation = "With Azure Functions, the cloud infrastructure provides all up-to-date resources needed to keep applications running — developers don't worry about deploying or maintaining servers."
            ),
            Question(
                id = 9,
                questionText = "Which Azure service can be used as a low-latency event trigger for Azure Functions?",
                options = listOf(
                    "Azure Blob Storage",
                    "Azure Event Grid",
                    "Azure Virtual Network",
                    "Azure DNS"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Event Grid provides low-latency event triggers for Azure Functions, enabling near-real-time data processing as part of the hot path for streaming and event processing scenarios."
            ),
            Question(
                id = 10,
                questionText = "In a real-time stream processing scenario, where can Azure Functions store processed IoT data for use in an analytics dashboard?",
                options = listOf(
                    "Azure Blob Storage cold tier",
                    "Azure Table Storage",
                    "Azure Cosmos DB",
                    "Azure File Storage"
                ),
                correctAnswerIndex = 2,
                explanation = "In real-time stream processing, Azure Functions can process IoT and cloud telemetry in near real-time and store it in Azure Cosmos DB for use in analytics dashboards."
            ),
            Question(
                id = 11,
                questionText = "What Azure service provides real-time output for Azure Functions in stream processing scenarios?",
                options = listOf(
                    "Azure Blob Storage",
                    "Azure SignalR",
                    "Azure Table Storage",
                    "Azure DNS"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure SignalR provides real-time output capabilities for Azure Functions, enabling scenarios that push data to clients in near-real-time as part of stream processing pipelines."
            ),
            Question(
                id = 12,
                questionText = "How can Azure Functions be used with Machine Learning and AI?",
                options = listOf(
                    "Azure Functions can only run simple arithmetic calculations",
                    "Functions can connect to Azure OpenAI, call TensorFlow models, or use Azure AI services to process and classify data",
                    "Azure Functions replaces the need for dedicated ML training infrastructure",
                    "Functions can only trigger ML jobs but cannot process their outputs"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Functions can integrate with Azure OpenAI for text/chat completions, call TensorFlow models, and use Azure AI services — for example, to process and classify a stream of images."
            ),
            Question(
                id = 13,
                questionText = "What Azure OpenAI binding extension capability does Azure Functions provide?",
                options = listOf(
                    "Training new machine learning models from scratch",
                    "Storing OpenAI model weights in Azure Blob Storage",
                    "Enabling text and chat completions, assistants, embeddings, and semantic search within function code",
                    "Replacing Azure Cognitive Services with a serverless equivalent"
                ),
                correctAnswerIndex = 2,
                explanation = "The Azure OpenAI binding extension lets you integrate Azure OpenAI features into function code — including text completions, chat completions, assistants, embeddings, and semantic search."
            ),
            Question(
                id = 14,
                questionText = "How can Azure Functions be used to run scheduled tasks?",
                options = listOf(
                    "By manually triggering the function every time a task needs to run",
                    "By defining a cron schedule that triggers the function at specified intervals",
                    "By using Azure Virtual Machines to call the function on a schedule",
                    "Scheduled tasks are not supported in Azure Functions"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Functions supports cron schedule triggers, allowing you to define exactly when and how often a function runs — such as analyzing a database for duplicate entries every 15 minutes."
            ),
            Question(
                id = 15,
                questionText = "Which serverless platform is best suited for AWS-heavy environments?",
                options = listOf(
                    "Azure Functions",
                    "Google Cloud Functions",
                    "AWS Lambda",
                    "Azure Logic Apps"
                ),
                correctAnswerIndex = 2,
                explanation = "AWS Lambda is best suited for AWS-heavy environments, offering strong AWS service integrations and better cold start mitigation via Provisioned Concurrency."
            ),
            Question(
                id = 16,
                questionText = "Which serverless platform is ideal for enterprises using Microsoft technologies like C# and .NET?",
                options = listOf(
                    "AWS Lambda",
                    "Google Cloud Functions",
                    "Azure Functions",
                    "Firebase Functions"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Functions is ideal for enterprises using Microsoft technologies (C#, .NET) and Azure services like Event Grid, Service Bus, and Logic Apps."
            ),
            Question(
                id = 17,
                questionText = "Which serverless platform is a good fit for applications relying on Firebase, Pub/Sub, and BigQuery?",
                options = listOf(
                    "Azure Functions",
                    "AWS Lambda",
                    "Google Cloud Functions",
                    "Azure Logic Apps"
                ),
                correctAnswerIndex = 2,
                explanation = "Google Cloud Functions is a good fit for Google Cloud-native applications, especially those relying on Firebase, Pub/Sub, and BigQuery integrations."
            ),
            Question(
                id = 18,
                questionText = "What is 'Provisioned Concurrency' in the context of serverless platforms?",
                options = listOf(
                    "A feature that limits how many functions can run simultaneously",
                    "An AWS Lambda feature that mitigates cold start latency by keeping function instances pre-warmed",
                    "A billing model for concurrent serverless executions",
                    "A Google Cloud feature for running parallel ML workloads"
                ),
                correctAnswerIndex = 1,
                explanation = "Provisioned Concurrency is an AWS Lambda feature that keeps function instances pre-warmed and ready to respond, significantly mitigating cold start latency issues."
            ),
            Question(
                id = 19,
                questionText = "What is 'Serverless Kubernetes' as a serverless application pattern?",
                options = listOf(
                    "Running Kubernetes on physical servers without a hypervisor",
                    "A pattern where Kubernetes clusters scale automatically and you don't manage the underlying node infrastructure",
                    "A completely stateless version of Kubernetes with no persistent storage",
                    "Replacing Kubernetes entirely with serverless functions"
                ),
                correctAnswerIndex = 1,
                explanation = "Serverless Kubernetes is a pattern where the underlying node infrastructure is managed by the cloud provider — you deploy containers without managing the servers running them, combining container flexibility with serverless simplicity."
            ),
            Question(
                id = 20,
                questionText = "What is the best approach to maximize benefits when adopting serverless computing?",
                options = listOf(
                    "Use serverless only for compute and manage all other services traditionally",
                    "Use an end-to-end serverless platform providing a comprehensive set of serverless technologies across compute, database, messaging, analytics, and AI",
                    "Adopt serverless only for non-critical background tasks",
                    "Use serverless exclusively for mobile applications"
                ),
                correctAnswerIndex = 1,
                explanation = "Using an end-to-end serverless platform that covers compute, database, messaging, analytics, and AI ensures the organization gains maximum benefit — every component of the application benefits from the serverless approach."
            )
        )
    )

    // ── QUIZ 13: Cloud & IoT Systems Security ────────────────────────
    private val cloudIoTSecurityQuiz = Quiz(
        id = "cloud_iot_security_week15",
        title = "Cloud & IoT Systems Security",
        description = "Week 15 – IAM, Microsoft Entra ID, IoT Threat Modeling & Security",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What does IAM stand for in cloud security?",
                options = listOf(
                    "Internet Access Management",
                    "Identity and Access Management",
                    "Infrastructure and Application Monitoring",
                    "Integrated Authentication Mechanism"
                ),
                correctAnswerIndex = 1,
                explanation = "IAM stands for Identity and Access Management — a framework of policies and technologies that ensures the right people have the right access to the right resources."
            ),
            Question(
                id = 2,
                questionText = "What is the primary purpose of Identity and Access Management (IAM)?",
                options = listOf(
                    "To encrypt data stored in cloud databases",
                    "To monitor network traffic for suspicious activity",
                    "To ensure the right individuals have appropriate access to the right resources at the right times",
                    "To provide firewall rules for cloud virtual networks"
                ),
                correctAnswerIndex = 2,
                explanation = "IAM ensures that the right individuals have appropriate access to the right resources at the right times and for the right reasons — controlling who can access what in a system."
            ),
            Question(
                id = 3,
                questionText = "What is the difference between Authentication and Authorization in IAM?",
                options = listOf(
                    "Authentication grants access to resources; Authorization verifies identity",
                    "Authentication verifies who you are; Authorization determines what you are allowed to do",
                    "Authentication encrypts data; Authorization decrypts data",
                    "There is no difference — they are the same process"
                ),
                correctAnswerIndex = 1,
                explanation = "Authentication verifies the identity of a user (who you are), while Authorization determines what resources and actions that verified user is permitted to access or perform."
            ),
            Question(
                id = 4,
                questionText = "What is Microsoft Entra ID?",
                options = listOf(
                    "A cloud-based firewall service for Azure virtual networks",
                    "Microsoft's cloud-based Identity and Access Management service",
                    "A storage encryption service for Azure Blob Storage",
                    "A monitoring tool for tracking Azure resource costs"
                ),
                correctAnswerIndex = 1,
                explanation = "Microsoft Entra ID (formerly Azure Active Directory) is Microsoft's cloud-based Identity and Access Management service, enabling users to sign in and access resources securely."
            ),
            Question(
                id = 5,
                questionText = "Which of the following groups uses Microsoft Entra ID?",
                options = listOf(
                    "Only individual developers building personal apps",
                    "Only on-premises Windows Server administrators",
                    "IT administrators, app developers, and business subscribers to Microsoft 365 or Azure",
                    "Only government agencies and regulated industries"
                ),
                correctAnswerIndex = 2,
                explanation = "Microsoft Entra ID is used by IT administrators (to control access), app developers (to add authentication to apps), and business subscribers to Microsoft services like Microsoft 365 and Azure."
            ),
            Question(
                id = 6,
                questionText = "What are the five major steps of threat modeling?",
                options = listOf(
                    "Plan, Design, Build, Test, Deploy",
                    "Defining security requirements, Creating an application diagram, Identifying threats, Mitigating threats, Validating that threats have been mitigated",
                    "Discover, Analyze, Respond, Recover, Review",
                    "Authentication, Authorization, Encryption, Monitoring, Patching"
                ),
                correctAnswerIndex = 1,
                explanation = "The five major threat modeling steps are: (1) Defining security requirements, (2) Creating an application diagram, (3) Identifying threats, (4) Mitigating threats, and (5) Validating that threats have been mitigated."
            ),
            Question(
                id = 7,
                questionText = "Why is threat modeling important when designing an IoT architecture?",
                options = listOf(
                    "It reduces the cost of IoT hardware procurement",
                    "Understanding how an attacker might compromise a system helps ensure appropriate mitigations are in place from the start",
                    "It speeds up the deployment of IoT devices to production",
                    "It replaces the need for encryption in IoT solutions"
                ),
                correctAnswerIndex = 1,
                explanation = "Threat modeling helps identify vulnerabilities early — understanding how an attacker might compromise a system allows appropriate defenses to be built into the architecture from the start."
            ),
            Question(
                id = 8,
                questionText = "What are the four IoT architecture zones used in threat modeling?",
                options = listOf(
                    "Hardware, Software, Network, and Cloud",
                    "Device, Field gateway, Cloud gateway, and Service",
                    "Sensors, Actuators, Hub, and Storage",
                    "Edge, Fog, Cloud, and Application"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT architecture is divided into four zones for threat modeling: Device, Field gateway, Cloud gateway, and Service — each with its own security requirements and trust boundaries."
            ),
            Question(
                id = 9,
                questionText = "What is a 'trust boundary' in IoT security?",
                options = listOf(
                    "A firewall rule preventing devices from accessing the internet",
                    "A physical wall separating IoT devices from network infrastructure",
                    "The boundary between zones where data transitions from one source to another and may be subject to threats",
                    "A certificate authority that validates device identities"
                ),
                correctAnswerIndex = 2,
                explanation = "A trust boundary is the separation between IoT zones representing a data transition point. During this transition, data could be subject to threats like spoofing, tampering, and denial of service."
            ),
            Question(
                id = 10,
                questionText = "Which of the following is a threat that data crossing a trust boundary may face?",
                options = listOf(
                    "Data compression",
                    "Load balancing",
                    "Spoofing",
                    "Caching"
                ),
                correctAnswerIndex = 2,
                explanation = "Spoofing is one of the six threats data may face at trust boundaries. The full set is: Spoofing, Tampering, Repudiation, Information disclosure, Denial of service, and Elevation of privilege."
            ),
            Question(
                id = 11,
                questionText = "What does 'Tampering' mean as an IoT security threat?",
                options = listOf(
                    "An attacker pretends to be a legitimate device or user",
                    "An attacker denies performing a malicious action",
                    "An attacker modifies data in transit or at rest without authorization",
                    "An attacker floods the system with requests to make it unavailable"
                ),
                correctAnswerIndex = 2,
                explanation = "Tampering refers to the unauthorized modification of data — an attacker intercepts and alters data in transit or modifies stored data, compromising its integrity."
            ),
            Question(
                id = 12,
                questionText = "What does 'Repudiation' mean as an IoT security threat?",
                options = listOf(
                    "Unauthorized access to sensitive data",
                    "A threat where an attacker denies having performed a malicious action, making it difficult to trace",
                    "Overloading a service to make it unavailable",
                    "Gaining unauthorized elevated privileges in a system"
                ),
                correctAnswerIndex = 1,
                explanation = "Repudiation occurs when an attacker denies having performed a malicious action, and there is no way to prove otherwise — often addressed through logging and audit trails."
            ),
            Question(
                id = 13,
                questionText = "What does 'Elevation of Privilege' mean as an IoT security threat?",
                options = listOf(
                    "A legitimate user is given additional permissions by an admin",
                    "An attacker gains more access rights than intended, allowing them to perform unauthorized actions",
                    "A cloud service is scaled up to handle more devices",
                    "An IoT device is given a firmware upgrade remotely"
                ),
                correctAnswerIndex = 1,
                explanation = "Elevation of Privilege occurs when an attacker gains more access rights or permissions than they are authorized to have, enabling them to perform actions beyond their intended scope."
            ),
            Question(
                id = 14,
                questionText = "What does 'Information Disclosure' mean as an IoT security threat?",
                options = listOf(
                    "Publishing IoT device documentation publicly",
                    "Sending device telemetry to authorized cloud services",
                    "Unauthorized exposure of sensitive data to individuals who should not have access",
                    "Sharing device firmware updates with registered users"
                ),
                correctAnswerIndex = 2,
                explanation = "Information Disclosure is the unauthorized exposure of sensitive data — an attacker gains access to data they are not authorized to see, such as device credentials, user data, or proprietary information."
            ),
            Question(
                id = 15,
                questionText = "What does 'Denial of Service' (DoS) mean as an IoT security threat?",
                options = listOf(
                    "A user voluntarily disconnecting their IoT device from the cloud",
                    "An attacker flooding a system with requests to overwhelm it and make it unavailable to legitimate users",
                    "A cloud service refusing to accept connections from unregistered devices",
                    "An IoT device running out of battery power"
                ),
                correctAnswerIndex = 1,
                explanation = "Denial of Service (DoS) is an attack where the attacker overwhelms a system with traffic or requests, making it unavailable to legitimate users or devices."
            ),
            Question(
                id = 16,
                questionText = "Why does each IoT zone have its own authentication and authorization requirements?",
                options = listOf(
                    "Because different zones use different programming languages",
                    "Because each zone handles different types of data and has different trust levels, requiring appropriate controls",
                    "Because cloud providers charge separately for each zone's security",
                    "Because IoT devices cannot use the same protocols as cloud services"
                ),
                correctAnswerIndex = 1,
                explanation = "Each IoT zone handles different data with different sensitivity levels and has different trust relationships, requiring tailored authentication and authorization controls appropriate to each zone's risk profile."
            ),
            Question(
                id = 17,
                questionText = "What is 'Spoofing' as an IoT security threat?",
                options = listOf(
                    "Encrypting data so only authorized parties can read it",
                    "An attacker impersonating a legitimate device, user, or service to gain unauthorized access",
                    "Overwriting device firmware with malicious code",
                    "Intercepting messages between devices and the cloud"
                ),
                correctAnswerIndex = 1,
                explanation = "Spoofing is when an attacker impersonates a legitimate entity — such as a trusted device, user, or service — to gain unauthorized access to the system."
            ),
            Question(
                id = 18,
                questionText = "What is the role of the 'Field Gateway' zone in IoT architecture?",
                options = listOf(
                    "It is where end-user applications consume IoT data",
                    "It is the cloud service that stores and processes IoT telemetry",
                    "It sits between IoT devices and the cloud gateway, aggregating and preprocessing device data locally",
                    "It is the individual IoT sensor or actuator device"
                ),
                correctAnswerIndex = 2,
                explanation = "The Field Gateway zone sits between IoT devices and the cloud, aggregating data from multiple devices, preprocessing it locally, and forwarding it to the cloud gateway — acting as a local broker."
            ),
            Question(
                id = 19,
                questionText = "What authentication and authorization standard is commonly used in cloud IAM systems?",
                options = listOf(
                    "FTP and SFTP",
                    "OAuth 2.0 and OpenID Connect",
                    "SMTP and IMAP",
                    "DNS and DHCP"
                ),
                correctAnswerIndex = 1,
                explanation = "OAuth 2.0 and OpenID Connect are the widely used open standards for authentication and authorization in cloud IAM systems, enabling secure delegated access and identity verification."
            ),
            Question(
                id = 20,
                questionText = "What is the correct order of the five threat modeling steps?",
                options = listOf(
                    "Identify threats → Define requirements → Create diagram → Mitigate → Validate",
                    "Create diagram → Identify threats → Define requirements → Validate → Mitigate",
                    "Define security requirements → Create application diagram → Identify threats → Mitigate threats → Validate mitigations",
                    "Mitigate threats → Validate → Define requirements → Create diagram → Identify threats"
                ),
                correctAnswerIndex = 2,
                explanation = "The correct order is: (1) Define security requirements, (2) Create an application diagram, (3) Identify threats, (4) Mitigate threats, (5) Validate that threats have been mitigated."
            )
        )
    )

    // ── QUIZ 14: Azure IoT Edge ───────────────────────────────────────
    private val azureIoTEdgeQuiz = Quiz(
        id = "azure_iot_edge_week16",
        title = "Azure IoT Edge",
        description = "Week 16 – Azure IoT Edge, Modules, Runtime & Edge Computing",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is the core concept behind Azure IoT Edge?",
                options = listOf(
                    "Moving all IoT data processing to a central cloud datacenter",
                    "Bringing compute capability closer to the source of data by moving workloads from the cloud to edge devices",
                    "Replacing Azure IoT Hub with a fully on-premises solution",
                    "Storing all IoT telemetry in Azure Blob Storage for batch processing"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure IoT Edge brings compute capability closer to the data source by moving workloads from the cloud to edge devices, overcoming problems of latency and response times."
            ),
            Question(
                id = 2,
                questionText = "What problem does Azure IoT Edge primarily overcome?",
                options = listOf(
                    "High cost of cloud storage",
                    "Lack of device identity management in IoT Hub",
                    "Latency and response time issues caused by sending all data to the cloud",
                    "Inability to run containers in the cloud"
                ),
                correctAnswerIndex = 2,
                explanation = "IoT Edge overcomes the problems of latency and response times by processing data locally on edge devices rather than sending everything to the cloud for processing."
            ),
            Question(
                id = 3,
                questionText = "Which of the following is an advantage of deploying AI applications on IoT Edge devices?",
                options = listOf(
                    "AI models can only be trained and run in the cloud",
                    "Machine learning models can be trained in the cloud and then deployed on edge devices for local inference",
                    "IoT Edge eliminates the need for machine learning entirely",
                    "Edge AI requires dedicated GPU servers at each device location"
                ),
                correctAnswerIndex = 1,
                explanation = "A key advantage of IoT Edge is that ML models can be trained in the cloud and deployed to edge devices — enabling AI inference locally without cloud round trips for every prediction."
            ),
            Question(
                id = 4,
                questionText = "What is the offline capability of Azure IoT Edge?",
                options = listOf(
                    "IoT Edge devices stop functioning when disconnected from the cloud",
                    "IoT Edge can run in offline mode, storing data securely on the device and continuing operations without cloud connectivity",
                    "Offline mode is only available for Windows-based IoT Edge devices",
                    "Offline mode requires a dedicated backup internet connection"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge provides the ability to run in offline mode — devices continue operating, store data securely locally, and sync with the cloud when connectivity is restored."
            ),
            Question(
                id = 5,
                questionText = "In the glucose monitoring scenario, why is the alert generated at the edge device rather than in the cloud?",
                options = listOf(
                    "Cloud services are not reliable enough for medical alerts",
                    "The edge device generates alerts rapidly without the latency of a cloud round trip, enabling immediate response",
                    "Cloud services cannot process glucose level data",
                    "Medical data cannot legally be sent to the cloud"
                ),
                correctAnswerIndex = 1,
                explanation = "The algorithm runs on the IoT Edge device so alarms can be generated rapidly in response to changing glucose levels without the latency of connecting to the cloud — enabling immediate doctor notification."
            ),
            Question(
                id = 6,
                questionText = "What are IoT Edge modules?",
                options = listOf(
                    "Physical hardware components attached to IoT Edge devices",
                    "Cloud-based virtual machines that process IoT data remotely",
                    "Units of execution implemented as Docker-compatible containers that run business logic at the edge",
                    "Azure Resource Manager templates for deploying IoT solutions"
                ),
                correctAnswerIndex = 2,
                explanation = "IoT Edge modules are units of execution implemented as Docker-compatible containers. They run business logic at the edge and can execute Azure services, third-party services, or custom code."
            ),
            Question(
                id = 7,
                questionText = "What can IoT Edge modules be configured to do with each other?",
                options = listOf(
                    "Modules cannot communicate directly with each other",
                    "Communicate with each other to create a data processing pipeline",
                    "Replace each other automatically when one fails",
                    "Synchronize their clocks to ensure consistent timestamps"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge modules can be configured to communicate with each other, creating a pipeline for data processing — allowing you to chain modules together for complex processing workflows."
            ),
            Question(
                id = 8,
                questionText = "What is the IoT Edge runtime responsible for?",
                options = listOf(
                    "Training machine learning models in the cloud",
                    "Managing IoT Hub device identities and authentication",
                    "Running on each IoT Edge device, managing modules, ensuring they always run, and reporting module health to the cloud",
                    "Routing messages between Azure services in the cloud"
                ),
                correctAnswerIndex = 2,
                explanation = "The IoT Edge runtime runs on each IoT Edge device and manages the modules deployed to it — ensuring modules are always running, managing communications, and reporting module health to the cloud."
            ),
            Question(
                id = 9,
                questionText = "Which of the following is a function of the IoT Edge runtime?",
                options = listOf(
                    "Training and updating machine learning models",
                    "Installing and updating workloads on the edge device",
                    "Providing a web dashboard for device management",
                    "Replacing the need for Azure IoT Hub"
                ),
                correctAnswerIndex = 1,
                explanation = "The IoT Edge runtime performs several functions including installing and updating workloads, maintaining security standards, and managing communications between modules, leaf devices, and the cloud."
            ),
            Question(
                id = 10,
                questionText = "What does the IoT Edge cloud interface enable?",
                options = listOf(
                    "Direct physical access to IoT Edge devices",
                    "Remote monitoring and management of IoT Edge devices at scale",
                    "Training machine learning models on edge devices",
                    "Replacing Docker containers with virtual machines"
                ),
                correctAnswerIndex = 1,
                explanation = "The IoT Edge cloud interface enables you to remotely monitor and manage IoT Edge devices at scale — creating workloads for specific device types, deploying them, and monitoring across geographically scattered devices."
            ),
            Question(
                id = 11,
                questionText = "Why is managing IoT devices 'at scale' important for IoT Edge?",
                options = listOf(
                    "Because each device runs a different operating system that needs individual updates",
                    "Because millions of IoT devices are often different makes, models, and in diverse locations — making per-device management impossible",
                    "Because edge devices cannot be updated remotely without physical access",
                    "Because cloud providers charge per device for management operations"
                ),
                correctAnswerIndex = 1,
                explanation = "Managing millions of IoT devices that are different makes/models in diverse locations cannot be done per-device — IoT Edge enables workloads to be created, deployed, and monitored at scale centrally."
            ),
            Question(
                id = 12,
                questionText = "How does IoT Edge manage the end-to-end machine learning deployment cycle on IoT devices?",
                options = listOf(
                    "By training models directly on IoT devices using local sensor data",
                    "By encapsulating ML models in Docker-compatible containers managed by IoT Edge runtime and the cloud interface",
                    "By requiring developers to manually update each device with new model versions",
                    "By storing all ML models in Azure Blob Storage and loading them at runtime"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge encapsulates ML models in Docker-compatible containers, allowing the IoT Edge runtime and cloud interface to manage the full lifecycle — deployment, execution, monitoring, and updates."
            ),
            Question(
                id = 13,
                questionText = "Which capability of IoT Edge allows it to reduce cloud data transfer costs?",
                options = listOf(
                    "Deploying using secure and certified hardware",
                    "Managing data at the edge to process and filter it locally, reducing the volume sent to the cloud",
                    "Using existing developer skillsets and code",
                    "Acting as a gateway for downstream devices"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge can manage and process data locally, filtering and aggregating it before sending only relevant summarized data to the cloud — significantly reducing data transfer costs and bandwidth usage."
            ),
            Question(
                id = 14,
                questionText = "What does it mean for IoT Edge to 'act as a gateway'?",
                options = listOf(
                    "IoT Edge provides internet access to devices that lack connectivity",
                    "IoT Edge acts as an intermediary that translates protocols and aggregates data from downstream leaf devices before forwarding to the cloud",
                    "IoT Edge replaces the Azure VPN Gateway for on-premises connections",
                    "IoT Edge acts as a DNS gateway for resolving device names"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge can act as a gateway — sitting between downstream leaf devices and the cloud, translating protocols, aggregating data, and managing communications on behalf of simpler devices."
            ),
            Question(
                id = 15,
                questionText = "What technology do IoT Edge modules use for deployment?",
                options = listOf(
                    "Azure Virtual Machines",
                    "Docker-compatible containers",
                    "ARM templates",
                    "PowerShell scripts"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge modules are deployed as Docker-compatible containers, providing portability, isolation, and consistent runtime environments across different edge device hardware."
            ),
            Question(
                id = 16,
                questionText = "What is the benefit of using 'secure and certified hardware' for IoT Edge deployments?",
                options = listOf(
                    "Certified hardware is cheaper than standard hardware",
                    "It ensures the edge device hardware meets security standards, providing a trusted foundation for running sensitive workloads",
                    "Only certified hardware can run Docker containers",
                    "Certified hardware automatically updates its own firmware"
                ),
                correctAnswerIndex = 1,
                explanation = "Deploying on secure and certified hardware ensures the foundation of the IoT Edge deployment meets security standards — providing a hardware root of trust for running sensitive AI and business logic workloads."
            ),
            Question(
                id = 17,
                questionText = "What does 'distributing AI and analytics workloads to the edge' enable?",
                options = listOf(
                    "It removes the need for any cloud connectivity in IoT solutions",
                    "It allows intelligent processing and decision-making to happen locally on devices, reducing latency and enabling offline AI",
                    "It transfers all cloud costs to edge device hardware costs",
                    "It replaces the need for Azure Stream Analytics"
                ),
                correctAnswerIndex = 1,
                explanation = "Distributing AI and analytics to the edge enables intelligent local processing and decision-making — running inference and analytics directly on devices, reducing latency and enabling AI even without cloud connectivity."
            ),
            Question(
                id = 18,
                questionText = "What happens to data on an IoT Edge device when cloud connectivity is poor or unavailable?",
                options = listOf(
                    "The device shuts down and waits for connectivity to resume",
                    "All collected data is permanently lost",
                    "The device continues operating, storing data securely locally until connectivity is restored",
                    "The device automatically switches to a backup cellular connection"
                ),
                correctAnswerIndex = 2,
                explanation = "IoT Edge devices reliably operate in offline or intermittent connectivity mode — data is stored securely on the device and synced to the cloud when connectivity is restored."
            ),
            Question(
                id = 19,
                questionText = "What does the IoT Edge runtime manage in terms of module communication?",
                options = listOf(
                    "Only communication between the edge device and the internet",
                    "Communication between modules on a device, between leaf devices and the IoT Edge device, and between the IoT Edge device and the cloud",
                    "Only communication between the edge device and Azure IoT Hub",
                    "Only communication between different IoT Edge devices"
                ),
                correctAnswerIndex = 1,
                explanation = "The IoT Edge runtime manages three levels of communication: between modules on the same device, between downstream leaf devices and the IoT Edge device, and between the IoT Edge device and the cloud."
            ),
            Question(
                id = 20,
                questionText = "What is the key advantage of using IoT Edge for privacy in IoT deployments?",
                options = listOf(
                    "IoT Edge encrypts all data sent to the cloud with military-grade encryption",
                    "Sensitive data can be processed and kept locally on the edge device without needing to send it to the cloud",
                    "IoT Edge automatically anonymizes all user data before cloud transmission",
                    "IoT Edge stores data in a private Azure Government cloud region"
                ),
                correctAnswerIndex = 1,
                explanation = "IoT Edge ensures privacy by enabling sensitive data to be processed locally on the device — keeping confidential data on-premises without transmitting it to the cloud, addressing data sovereignty and privacy concerns."
            )
        )
    )

    // ── QUIZ 15: Azure Governance and Management ─────────────────────
    private val azureGovernanceQuiz = Quiz(
        id = "azure_governance_week18",
        title = "Azure Governance & Management",
        description = "Week 18 – Azure Costs, Pricing Calculator, TCO, Cost Management & Tags",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "How does Azure shift development costs compared to traditional on-premises infrastructure?",
                options = listOf(
                    "From OpEx (operational expenditure) to CapEx (capital expenditure)",
                    "From CapEx of building infrastructure to OpEx of renting infrastructure as needed",
                    "Azure eliminates all IT costs entirely",
                    "From monthly billing to annual upfront payment only"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure shifts costs from CapEx (buying physical infrastructure upfront) to OpEx (renting infrastructure as needed) — you pay only for what you use, when you use it."
            ),
            Question(
                id = 2,
                questionText = "Which of the following is a factor that can affect costs in Azure?",
                options = listOf(
                    "The color scheme of your Azure portal theme",
                    "The number of developers on your team",
                    "Geography — where your resources are deployed",
                    "The version of the browser used to access the portal"
                ),
                correctAnswerIndex = 2,
                explanation = "Geography is one of the key factors affecting Azure costs — different regions have different pricing due to infrastructure costs, energy costs, and local regulations."
            ),
            Question(
                id = 3,
                questionText = "How does 'Resource Type' affect Azure costs?",
                options = listOf(
                    "All Azure resources cost the same regardless of type",
                    "Different resource types have different pricing models based on their settings, configuration, and region",
                    "Resource type only affects costs in the free tier",
                    "Only compute resources vary in cost — storage is always free"
                ),
                correctAnswerIndex = 1,
                explanation = "Resource type significantly affects cost — different Azure resources (VMs, storage, databases) have different pricing models, and settings within each type (size, tier, region) further impact costs."
            ),
            Question(
                id = 4,
                questionText = "What does 'Consumption' mean as a factor affecting Azure costs?",
                options = listOf(
                    "The amount of electricity used by Azure datacenters",
                    "The number of Azure subscriptions under your account",
                    "How much of a resource you use — paying for what you consume rather than a fixed amount",
                    "The number of API calls made to Azure management APIs"
                ),
                correctAnswerIndex = 2,
                explanation = "Consumption refers to how much of a resource you actually use — Azure's pay-as-you-go model means costs are directly tied to resource consumption, giving flexibility to scale usage."
            ),
            Question(
                id = 5,
                questionText = "Why does 'Maintenance' affect Azure costs?",
                options = listOf(
                    "Azure charges a maintenance fee for all resources annually",
                    "Unused or improperly deprovisioned resources continue to accrue costs — good maintenance practices prevent unnecessary spending",
                    "Maintenance windows require additional compute resources that are billed separately",
                    "Azure charges extra during maintenance periods when updates are applied"
                ),
                correctAnswerIndex = 1,
                explanation = "Maintenance affects costs because resources left running when no longer needed continue to incur charges. Proper maintenance — deprovisioning unused resources — prevents unnecessary Azure spending."
            ),
            Question(
                id = 6,
                questionText = "What is the Azure Marketplace and how can it affect costs?",
                options = listOf(
                    "A free store for downloading Azure documentation and tutorials",
                    "A platform where third-party vendors sell solutions and services that run on Azure, which may add costs beyond base Azure resource costs",
                    "A marketplace for buying physical Azure-certified hardware devices",
                    "An internal Microsoft store for purchasing Azure reserved instances"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Marketplace allows third-party vendors to sell software and services that run on Azure. Using marketplace solutions may involve additional costs beyond the underlying Azure resource costs."
            ),
            Question(
                id = 7,
                questionText = "What is the purpose of the Azure Pricing Calculator?",
                options = listOf(
                    "To calculate the cost of migrating from on-premises to Azure",
                    "To estimate the cost of running specific Azure services and configurations",
                    "To track actual spending on existing Azure resources",
                    "To compare the total cost of AWS vs Azure"
                ),
                correctAnswerIndex = 1,
                explanation = "The Azure Pricing Calculator helps you estimate the costs of specific Azure services and configurations before deploying — allowing you to plan and budget for Azure spending."
            ),
            Question(
                id = 8,
                questionText = "What is the purpose of the Total Cost of Ownership (TCO) Calculator?",
                options = listOf(
                    "To estimate the monthly cost of running Azure VMs",
                    "To track actual Azure resource spending over time",
                    "To compare the cost of running workloads on-premises versus in Azure, helping justify cloud migration",
                    "To calculate reserved instance savings for specific Azure services"
                ),
                correctAnswerIndex = 2,
                explanation = "The TCO Calculator helps organizations compare the cost of running workloads on-premises versus in Azure, providing a financial justification for cloud migration by estimating savings."
            ),
            Question(
                id = 9,
                questionText = "What is the key difference between the Pricing Calculator and the TCO Calculator?",
                options = listOf(
                    "The Pricing Calculator is free; the TCO Calculator requires a subscription",
                    "The Pricing Calculator estimates Azure service costs; the TCO Calculator compares on-premises vs Azure costs for migration justification",
                    "The Pricing Calculator works only for VMs; the TCO Calculator works for all services",
                    "There is no difference — both calculators serve the same purpose"
                ),
                correctAnswerIndex = 1,
                explanation = "The Pricing Calculator estimates what Azure services will cost for your configuration, while the TCO Calculator compares on-premises infrastructure costs to Azure costs to justify migration decisions."
            ),
            Question(
                id = 10,
                questionText = "What is the Microsoft Cost Management tool used for?",
                options = listOf(
                    "Calculating the cost of Azure Marketplace purchases",
                    "Monitoring, allocating, and optimizing actual Azure cloud spending",
                    "Estimating costs before deploying Azure resources",
                    "Managing software licenses for Microsoft 365"
                ),
                correctAnswerIndex = 1,
                explanation = "Microsoft Cost Management is a tool for monitoring, allocating, and optimizing actual Azure cloud spending — helping organizations understand where their money is going and control costs."
            ),
            Question(
                id = 11,
                questionText = "What are the three types of alerts in Azure Cost Management?",
                options = listOf(
                    "Usage alerts, Performance alerts, and Security alerts",
                    "Budget alerts, Credit alerts, and Department spending quota alerts",
                    "Resource alerts, Network alerts, and Compute alerts",
                    "Threshold alerts, Anomaly alerts, and Forecast alerts"
                ),
                correctAnswerIndex = 1,
                explanation = "The three types of cost alerts in Azure Cost Management are: Budget alerts (spending reaches defined limits), Credit alerts (Azure credits consumed), and Department spending quota alerts."
            ),
            Question(
                id = 12,
                questionText = "When are Budget Alerts triggered in Azure Cost Management?",
                options = listOf(
                    "Only when spending exceeds 100% of the defined budget",
                    "When spending based on usage or cost reaches or exceeds the amount defined in the alert condition",
                    "Only at the end of each billing month",
                    "When a new resource is deployed regardless of cost"
                ),
                correctAnswerIndex = 1,
                explanation = "Budget alerts notify you when spending (based on usage or cost) reaches or exceeds the amount defined in the alert condition — you can set the threshold at any percentage of your budget."
            ),
            Question(
                id = 13,
                questionText = "What are Credit Alerts in Azure Cost Management?",
                options = listOf(
                    "Alerts when your credit card payment is declined",
                    "Alerts that notify you when your Azure credit monetary commitments are consumed — generated automatically at 90% and 100% of credit balance",
                    "Alerts when you receive Azure promotional credits",
                    "Alerts when resources are deployed that qualify for free tier credits"
                ),
                correctAnswerIndex = 1,
                explanation = "Credit alerts notify organizations with Enterprise Agreements (EAs) when their Azure credit monetary commitments are being consumed — automatically generated at 90% and 100% of credit balance."
            ),
            Question(
                id = 14,
                questionText = "At what percentages are Credit Alerts automatically generated?",
                options = listOf(
                    "50% and 75%",
                    "75% and 100%",
                    "90% and 100%",
                    "80% and 95%"
                ),
                correctAnswerIndex = 2,
                explanation = "Credit alerts are generated automatically at 90% and at 100% of your Azure credit balance, giving organizations advance warning before credits are fully consumed."
            ),
            Question(
                id = 15,
                questionText = "What are Azure Resource Tags used for?",
                options = listOf(
                    "Physically labeling IoT devices with their Azure resource ID",
                    "Providing extra information or metadata about Azure resources to help with organization, cost management, security, and governance",
                    "Setting access control permissions on Azure resources",
                    "Tagging resources for automatic deletion after a set time period"
                ),
                correctAnswerIndex = 1,
                explanation = "Resource tags provide metadata about Azure resources — useful for resource management, cost management, operations management, security, governance/compliance, and workload optimization."
            ),
            Question(
                id = 16,
                questionText = "Which of the following is a valid use case for Azure Resource Tags?",
                options = listOf(
                    "Increasing the performance of Azure VMs",
                    "Automatically scaling resources based on demand",
                    "Cost management and optimization — tracking which teams or projects are responsible for specific resource costs",
                    "Encrypting data stored in Azure Blob Storage"
                ),
                correctAnswerIndex = 2,
                explanation = "Tags are extremely useful for cost management — tagging resources by department, project, or environment allows organizations to track and allocate costs accurately across teams."
            ),
            Question(
                id = 17,
                questionText = "Besides subscriptions and resource groups, what is another way to organize Azure resources?",
                options = listOf(
                    "Azure Availability Zones",
                    "Azure Region Pairs",
                    "Resource Tags",
                    "Azure Management Groups"
                ),
                correctAnswerIndex = 2,
                explanation = "Resource Tags are another way to organize resources beyond subscriptions and resource groups — providing flexible metadata-based organization that cuts across subscription and resource group boundaries."
            ),
            Question(
                id = 18,
                questionText = "How can Azure Budgets help with cost management?",
                options = listOf(
                    "Budgets automatically delete resources when spending limits are reached",
                    "Budgets allow you to set spending limits and receive alerts when costs approach or exceed those limits",
                    "Budgets negotiate lower pricing with Microsoft automatically",
                    "Budgets prevent any new resources from being deployed once the limit is reached"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Budgets let you set spending thresholds and configure alerts to notify you when costs approach or exceed those thresholds — helping you proactively manage and control Azure spending."
            ),
            Question(
                id = 19,
                questionText = "Which type of Azure agreement do Credit Alerts specifically apply to?",
                options = listOf(
                    "Pay-as-you-go subscriptions",
                    "Free tier accounts",
                    "Enterprise Agreements (EAs)",
                    "Student subscriptions"
                ),
                correctAnswerIndex = 2,
                explanation = "Credit alerts specifically apply to organizations with Enterprise Agreements (EAs) — notifying them when their Azure credit monetary commitments are being consumed."
            ),
            Question(
                id = 20,
                questionText = "What metadata can Azure Resource Tags provide that helps with governance and regulatory compliance?",
                options = listOf(
                    "The physical location of servers running the resource",
                    "The encryption algorithm used for data at rest",
                    "Information such as data classification, owner, compliance requirements, and environment type that helps enforce governance policies",
                    "The version of the Azure SDK used to deploy the resource"
                ),
                correctAnswerIndex = 2,
                explanation = "Tags can store governance metadata such as data classification (confidential, public), owner, compliance requirements, and environment type (production, development) — enabling consistent governance policy enforcement."
            )
        )
    )

    // ── QUIZ 16: Azure Big Data Processing ───────────────────────────
    private val azureBigDataQuiz = Quiz(
        id = "azure_big_data_week19",
        title = "Azure Big Data Processing",
        description = "Week 19 – Distributed Data Processing, Big Data, Azure Data Lake, Databricks & HDInsight",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is Distributed Data Processing?",
                options = listOf(
                    "Processing data on a single powerful server with multiple CPUs",
                    "Processing of large datasets across multiple nodes to enhance performance, scalability, and reliability",
                    "Storing data in multiple geographic locations for redundancy",
                    "Compressing large datasets to reduce storage costs"
                ),
                correctAnswerIndex = 1,
                explanation = "Distributed Data Processing involves processing large datasets across multiple nodes (servers), enhancing performance through parallelism, scalability by adding nodes, and reliability through redundancy."
            ),
            Question(
                id = 2,
                questionText = "What is Shared Nothing Architecture (SNA)?",
                options = listOf(
                    "A system where all nodes share the same memory and storage pool",
                    "A distributed computing architecture where each node is independent and self-sufficient, not sharing memory or storage — only communicating via network",
                    "An architecture where a single master node manages all data for worker nodes",
                    "A cloud architecture where resources are not shared between tenants"
                ),
                correctAnswerIndex = 1,
                explanation = "Shared Nothing Architecture (SNA) is a distributed computing architecture where each node is independent and self-sufficient — nodes do not share memory or storage and only communicate through a network."
            ),
            Question(
                id = 3,
                questionText = "How does Shared Disk Architecture differ from Shared Nothing Architecture?",
                options = listOf(
                    "Shared Disk has no network communication between nodes",
                    "Shared Disk partitions data so each node owns its own data exclusively",
                    "Shared Disk allows all nodes to read and write to a common storage pool, unlike SNA which partitions data across independent nodes",
                    "Shared Disk only allows one node to access storage at a time"
                ),
                correctAnswerIndex = 2,
                explanation = "Unlike Shared Nothing Architecture which gives each node its own independent storage, Shared Disk Architecture allows multiple computers to simultaneously access the same shared storage pool."
            ),
            Question(
                id = 4,
                questionText = "Which of the following best describes the Big Data concept?",
                options = listOf(
                    "Data that is stored only in relational databases",
                    "Extremely large and complex datasets that traditional data processing tools cannot handle efficiently",
                    "Data that is processed only in batch mode overnight",
                    "Any dataset larger than 1 gigabyte"
                ),
                correctAnswerIndex = 1,
                explanation = "Big Data refers to extremely large and complex datasets — characterized by high volume, velocity, and variety — that cannot be efficiently processed using traditional database tools."
            ),
            Question(
                id = 5,
                questionText = "What is Azure Data Lake primarily used for?",
                options = listOf(
                    "Running containerized microservices at scale",
                    "Storing and analyzing massive amounts of data of any size, type, and speed",
                    "Managing virtual machine disk images",
                    "Sending messages between application components"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Data Lake is designed for storing and analyzing massive amounts of data of any size, type, and processing speed — making it ideal for big data analytics scenarios."
            ),
            Question(
                id = 6,
                questionText = "According to the Big Data Tools comparison table, which Azure service provides Storage capability?",
                options = listOf(
                    "Azure Databricks",
                    "Azure HDInsight",
                    "Azure Data Lake",
                    "All three services provide storage"
                ),
                correctAnswerIndex = 2,
                explanation = "According to the comparison table, Azure Data Lake provides Storage (Yes), while Azure Databricks and HDInsight do not (No) — they are processing-focused services."
            ),
            Question(
                id = 7,
                questionText = "Which Azure big data services provide Processing capability?",
                options = listOf(
                    "Azure Data Lake only",
                    "Azure Data Lake and Azure Databricks",
                    "Azure Databricks and Azure HDInsight",
                    "All three: Data Lake, Databricks, and HDInsight"
                ),
                correctAnswerIndex = 2,
                explanation = "According to the comparison table, Azure Databricks (Yes) and Azure HDInsight (Yes) provide Processing capability, while Azure Data Lake does not (No) — it is focused on storage."
            ),
            Question(
                id = 8,
                questionText = "Which Azure big data service has the highest integration level according to the comparison table?",
                options = listOf(
                    "Azure HDInsight — High integration",
                    "Azure Data Lake and Azure Databricks — both High integration",
                    "Azure Databricks only — High integration",
                    "All three have equal integration levels"
                ),
                correctAnswerIndex = 1,
                explanation = "According to the comparison table, both Azure Data Lake and Azure Databricks have High integration, while Azure HDInsight has Moderate integration."
            ),
            Question(
                id = 9,
                questionText = "What is Azure Databricks primarily used for?",
                options = listOf(
                    "Storing raw unstructured data for long-term archival",
                    "A fast, easy, and collaborative Apache Spark-based analytics platform for big data processing and machine learning",
                    "Managing virtual network configurations",
                    "Provisioning IoT devices at scale"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Databricks is a fast, easy, and collaborative Apache Spark-based analytics platform optimized for Azure — used for big data processing, streaming analytics, and machine learning workloads."
            ),
            Question(
                id = 10,
                questionText = "What is Azure HDInsight?",
                options = listOf(
                    "A serverless function service for event-driven processing",
                    "A fully managed cloud service for open-source analytics frameworks like Hadoop, Spark, Hive, and Kafka",
                    "A relational database service for structured data",
                    "A monitoring tool for tracking Azure resource health"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure HDInsight is a fully managed, open-source analytics cloud service that makes it easy to process massive amounts of data using popular open-source frameworks like Hadoop, Spark, Hive, and Kafka."
            ),
            Question(
                id = 11,
                questionText = "What is Batch Processing in the context of big data?",
                options = listOf(
                    "Processing data in real time as it arrives",
                    "Processing large volumes of data collected over a period of time, typically run on a scheduled basis",
                    "Processing data only from IoT devices",
                    "Processing data in parallel using stream analytics"
                ),
                correctAnswerIndex = 1,
                explanation = "Batch Processing involves collecting large volumes of data over a period of time and processing them together in a scheduled batch — suitable for non-time-sensitive workloads like monthly reports."
            ),
            Question(
                id = 12,
                questionText = "What is Stream Processing in the context of big data?",
                options = listOf(
                    "Processing historical data stored in data warehouses",
                    "Scheduling large datasets to be processed overnight",
                    "Processing data continuously in real time as it is generated or received",
                    "Streaming video and audio content to end users"
                ),
                correctAnswerIndex = 2,
                explanation = "Stream Processing processes data continuously in real time as it is generated — enabling immediate insights and actions, unlike batch processing which works on historical accumulated data."
            ),
            Question(
                id = 13,
                questionText = "Which of the following is a Batch Processing use case?",
                options = listOf(
                    "Real-time fraud detection during a credit card transaction",
                    "Live traffic monitoring and rerouting",
                    "Monthly payroll processing and financial report generation",
                    "Instant alert when a sensor exceeds a temperature threshold"
                ),
                correctAnswerIndex = 2,
                explanation = "Monthly payroll processing and financial report generation are classic batch processing use cases — they process accumulated data on a scheduled basis and do not require real-time results."
            ),
            Question(
                id = 14,
                questionText = "Which of the following is a Stream Processing use case?",
                options = listOf(
                    "Generating annual sales reports",
                    "Processing last month's customer transactions for billing",
                    "Real-time fraud detection on financial transactions as they happen",
                    "Nightly backup of database records"
                ),
                correctAnswerIndex = 2,
                explanation = "Real-time fraud detection is a stream processing use case — financial transactions must be analyzed instantly as they occur to detect and prevent fraud before they complete."
            ),
            Question(
                id = 15,
                questionText = "Which of the following is a popular tool for Batch Processing?",
                options = listOf(
                    "Apache Kafka",
                    "Azure Stream Analytics",
                    "Apache Hadoop MapReduce",
                    "Apache Flink"
                ),
                correctAnswerIndex = 2,
                explanation = "Apache Hadoop MapReduce is one of the most popular tools for batch processing — it processes large datasets in parallel across a cluster by dividing work into map and reduce tasks."
            ),
            Question(
                id = 16,
                questionText = "Which of the following is a popular tool for Stream Processing?",
                options = listOf(
                    "Apache Hadoop",
                    "Apache Hive",
                    "Apache MapReduce",
                    "Apache Kafka"
                ),
                correctAnswerIndex = 3,
                explanation = "Apache Kafka is a popular distributed streaming platform used for real-time stream processing — it handles high-throughput, low-latency data streams at massive scale."
            ),
            Question(
                id = 17,
                questionText = "What is a key advantage of Shared Nothing Architecture for big data processing?",
                options = listOf(
                    "It allows nodes to share memory, reducing data duplication",
                    "Each node operates independently, enabling linear scalability by simply adding more nodes",
                    "It requires less network infrastructure than shared disk systems",
                    "It eliminates the need for data partitioning strategies"
                ),
                correctAnswerIndex = 1,
                explanation = "A key advantage of SNA is linear scalability — since each node is independent with its own storage and memory, you can scale by simply adding more nodes without creating bottlenecks."
            ),
            Question(
                id = 18,
                questionText = "Which future trend in big data processing involves moving computation closer to data sources?",
                options = listOf(
                    "AI-powered Data Processing",
                    "Hybrid Cloud Solutions",
                    "Edge Computing",
                    "Serverless Computing"
                ),
                correctAnswerIndex = 2,
                explanation = "Edge Computing is a future trend that moves computation closer to data sources — processing data at the edge reduces latency, bandwidth usage, and the need to send all raw data to the cloud."
            ),
            Question(
                id = 19,
                questionText = "What does 'AI-powered Data Processing' as a future trend mean?",
                options = listOf(
                    "Replacing all human data analysts with robots",
                    "Using artificial intelligence and machine learning to automate data processing, pattern detection, and insight generation at scale",
                    "Training AI models only on batch-processed historical data",
                    "Using AI to reduce the physical size of data storage hardware"
                ),
                correctAnswerIndex = 1,
                explanation = "AI-powered Data Processing is a trend where machine learning and AI are integrated into data pipelines to automate analysis, detect patterns, and generate insights at a scale and speed beyond human capability."
            ),
            Question(
                id = 20,
                questionText = "What is the main difference between Azure Data Lake and Azure Databricks in terms of their role in a big data solution?",
                options = listOf(
                    "Azure Data Lake processes data; Azure Databricks stores data",
                    "Both Azure Data Lake and Databricks serve identical purposes",
                    "Azure Data Lake is focused on storage of massive datasets; Azure Databricks is focused on processing and analytics",
                    "Azure Databricks only works with structured relational data; Data Lake handles unstructured data"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Data Lake focuses on storing massive datasets of any type and size, while Azure Databricks is an analytics and processing platform — they are complementary: Data Lake stores the data, Databricks processes it."
            )
        )
    )


    // ── QUIZ 17: DevOps & CI/CD using Azure DevOps ───────────────────
    private val devOpsQuiz = Quiz(
        id = "devops_cicd_week20",
        title = "DevOps & CI/CD",
        description = "Week 20 – DevOps Practices, CI/CD Pipelines & Azure DevOps",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is DevOps?",
                options = listOf(
                    "A programming language used for cloud development",
                    "A software development practice that promotes collaboration between development and operations, resulting in faster and more reliable software delivery",
                    "A type of cloud deployment model used by large enterprises",
                    "A testing framework for automated unit tests"
                ),
                correctAnswerIndex = 1,
                explanation = "DevOps is a software development practice that promotes collaboration between development and operations teams, connecting people, process, and technology to deliver continuous value more reliably and quickly."
            ),
            Question(
                id = 2,
                questionText = "What is DevOps commonly referred to as?",
                options = listOf(
                    "A methodology",
                    "A framework",
                    "A culture",
                    "A programming paradigm"
                ),
                correctAnswerIndex = 2,
                explanation = "DevOps is commonly referred to as a culture — it requires deep changes in the way people work and collaborate, not just the adoption of tools or processes."
            ),
            Question(
                id = 3,
                questionText = "What three things does DevOps connect to deliver continuous value?",
                options = listOf(
                    "Hardware, software, and networking",
                    "Planning, testing, and deployment",
                    "People, process, and technology",
                    "Development, security, and operations"
                ),
                correctAnswerIndex = 2,
                explanation = "DevOps connects people, process, and technology to deliver continuous value — all three must work together for a successful DevOps transformation."
            ),
            Question(
                id = 4,
                questionText = "What is the key difference between Traditional IT and DevOps?",
                options = listOf(
                    "Traditional IT uses automation; DevOps relies on manual processes",
                    "Traditional IT has development and operations working in silos; DevOps uses a collaborative approach with shared responsibility",
                    "Traditional IT deploys more frequently than DevOps",
                    "DevOps only works for small organizations; Traditional IT scales better"
                ),
                correctAnswerIndex = 1,
                explanation = "In Traditional IT, development and operations teams work in silos with separate goals. DevOps breaks down these silos with a collaborative approach and shared responsibility for the entire software lifecycle."
            ),
            Question(
                id = 5,
                questionText = "From which methodologies did DevOps emerge?",
                options = listOf(
                    "Waterfall and Six Sigma",
                    "Agile methodologies and Lean practices",
                    "PRINCE2 and ITIL",
                    "Scrum and Kanban only"
                ),
                correctAnswerIndex = 1,
                explanation = "DevOps emerged from Agile methodologies and Lean practices, building on their principles of iterative development, continuous improvement, and waste reduction."
            ),
            Question(
                id = 6,
                questionText = "Why was DevOps created?",
                options = listOf(
                    "To reduce the number of developers needed in a software team",
                    "To address problems like manual processes causing code errors, out-of-sync teams causing slow delivery, and disappointed business stakeholders",
                    "To replace Agile development methodologies entirely",
                    "To eliminate the need for testing in software development"
                ),
                correctAnswerIndex = 1,
                explanation = "DevOps was created to address: highly manual processes causing significant code errors, out-of-sync dev and ops teams causing slow delivery, and the resulting disappointment of business stakeholders."
            ),
            Question(
                id = 7,
                questionText = "What are the four phases of the DevOps application lifecycle?",
                options = listOf(
                    "Design, Code, Test, Release",
                    "Plan, Develop, Deliver, and Operate",
                    "Build, Test, Deploy, Monitor",
                    "Discover, Analyze, Implement, Review"
                ),
                correctAnswerIndex = 1,
                explanation = "DevOps influences the application lifecycle throughout its four phases: Plan, Develop, Deliver, and Operate — each phase relies on the others and is not role-specific."
            ),
            Question(
                id = 8,
                questionText = "In a true DevOps culture, how are roles distributed across lifecycle phases?",
                options = listOf(
                    "Developers only work in the Plan and Develop phases; Operations only works in Deliver and Operate",
                    "Each role is involved in each phase to some extent",
                    "Roles are strictly separated to avoid confusion and overlap",
                    "Only senior engineers participate in all phases"
                ),
                correctAnswerIndex = 1,
                explanation = "In a true DevOps culture, the phases are not role-specific — each role (development, operations, QA, security) is involved in each phase to some extent, promoting shared ownership."
            ),
            Question(
                id = 9,
                questionText = "Which of the following is a key element of DevOps culture?",
                options = listOf(
                    "Strict separation of development and operations responsibilities",
                    "Long release cycles to ensure stability",
                    "Collaboration, visibility, alignment, and continuous learning",
                    "Avoiding automation to maintain human oversight"
                ),
                correctAnswerIndex = 2,
                explanation = "Key elements of DevOps culture include collaboration, visibility, alignment, shifts in scope and accountability, shorter release cycles, and continuous learning."
            ),
            Question(
                id = 10,
                questionText = "What does CI stand for in CI/CD?",
                options = listOf(
                    "Continuous Infrastructure",
                    "Continuous Integration",
                    "Code Inspection",
                    "Containerized Instances"
                ),
                correctAnswerIndex = 1,
                explanation = "CI stands for Continuous Integration — the practice of frequently merging code changes from multiple developers into a shared repository, with automated builds and tests run on each merge."
            ),
            Question(
                id = 11,
                questionText = "What does CD stand for in CI/CD?",
                options = listOf(
                    "Code Deployment",
                    "Containerized Delivery",
                    "Continuous Deployment or Continuous Delivery",
                    "Cloud Distribution"
                ),
                correctAnswerIndex = 2,
                explanation = "CD stands for Continuous Deployment or Continuous Delivery — automating the release process so that validated code changes are automatically deployed to production or staging environments."
            ),
            Question(
                id = 12,
                questionText = "What does CI/CD automate?",
                options = listOf(
                    "The hiring process for software developers",
                    "The software release process — from code integration through testing to deployment",
                    "The physical server provisioning in datacenters",
                    "The process of writing user stories and requirements"
                ),
                correctAnswerIndex = 1,
                explanation = "CI/CD automates the software release process — automatically building, testing, and deploying code changes, reducing manual effort and enabling faster, more reliable software delivery."
            ),
            Question(
                id = 13,
                questionText = "What is 'Infrastructure as Code' (IaC) as a DevOps practice?",
                options = listOf(
                    "Writing application code that runs directly on physical hardware",
                    "Managing and provisioning infrastructure through code and configuration files rather than manual processes",
                    "Using code to monitor application performance metrics",
                    "Storing infrastructure documentation in a code repository"
                ),
                correctAnswerIndex = 1,
                explanation = "Infrastructure as Code (IaC) is the practice of managing and provisioning infrastructure through machine-readable configuration files — enabling consistent, repeatable infrastructure deployments with version control."
            ),
            Question(
                id = 14,
                questionText = "What is 'Version Control' as a DevOps practice?",
                options = listOf(
                    "Controlling which version of an application end users can access",
                    "Tracking and managing changes to code over time, enabling collaboration and the ability to revert to previous versions",
                    "Managing version numbers of API endpoints",
                    "Controlling the version of operating systems on servers"
                ),
                correctAnswerIndex = 1,
                explanation = "Version Control tracks and manages changes to code over time — enabling multiple developers to collaborate, maintain a history of changes, and revert to previous versions if needed."
            ),
            Question(
                id = 15,
                questionText = "What is 'Continuous Monitoring' in DevOps?",
                options = listOf(
                    "Manually checking server logs every hour",
                    "Continuously observing application performance, infrastructure health, and user behavior to detect and respond to issues in real time",
                    "Running automated tests only during business hours",
                    "Monitoring developer productivity through keystrokes and code commits"
                ),
                correctAnswerIndex = 1,
                explanation = "Continuous Monitoring involves continuously observing application performance, infrastructure health, and user behavior — enabling teams to detect issues, understand system health, and respond quickly."
            ),
            Question(
                id = 16,
                questionText = "What is DevSecOps?",
                options = listOf(
                    "A separate security team that reviews code after deployment",
                    "The practice of integrating security practices and testing throughout the entire DevOps pipeline rather than treating it as an afterthought",
                    "A security tool for scanning Azure virtual machines",
                    "A compliance framework for government cloud deployments"
                ),
                correctAnswerIndex = 1,
                explanation = "DevSecOps integrates security practices throughout the entire DevOps lifecycle — shifting security left so it is built into every phase rather than being an afterthought applied only at the end."
            ),
            Question(
                id = 17,
                questionText = "What is Azure DevOps?",
                options = listOf(
                    "A cloud-based virtual machine service for running DevOps tools",
                    "A set of developer services providing end-to-end DevOps capabilities including planning, source control, CI/CD pipelines, and artifact management",
                    "A monitoring tool for tracking Azure resource performance",
                    "A code editor integrated into the Azure portal"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure DevOps is a set of developer services providing end-to-end DevOps capabilities — including Azure Boards (planning), Azure Repos (source control), Azure Pipelines (CI/CD), and Azure Artifacts."
            ),
            Question(
                id = 18,
                questionText = "What benefit does connecting development and operations teams bring according to the lecture?",
                options = listOf(
                    "Increased hardware costs due to shared resources",
                    "Increased visibility, more accurate requirements, improved communication, and faster time to market",
                    "Reduced need for automated testing",
                    "Longer but more stable release cycles"
                ),
                correctAnswerIndex = 1,
                explanation = "Connecting development and operations leads to increased visibility, more accurate requirements, improved communication, and faster time to market — core benefits of the DevOps approach."
            ),
            Question(
                id = 19,
                questionText = "What is 'Configuration Management' as a DevOps practice?",
                options = listOf(
                    "Managing user account settings in Azure Active Directory",
                    "Tracking and controlling changes to software and infrastructure configurations to maintain consistency across environments",
                    "Configuring network security groups in Azure",
                    "Managing billing configurations in the Azure portal"
                ),
                correctAnswerIndex = 1,
                explanation = "Configuration Management tracks and controls changes to software and infrastructure configurations — ensuring consistency across development, testing, and production environments and preventing configuration drift."
            ),
            Question(
                id = 20,
                questionText = "What is the evolutionary path that led to DevOps?",
                options = listOf(
                    "From Agile to Scrum to DevOps",
                    "From Waterfall to Agile to DevOps",
                    "From DevOps to Agile to Waterfall",
                    "From Lean to Six Sigma to DevOps"
                ),
                correctAnswerIndex = 1,
                explanation = "DevOps evolved from Waterfall (sequential, slow releases) → Agile (iterative, faster releases) → DevOps (continuous delivery with development and operations collaboration and automation)."
            )
        )
    )

    // ── QUIZ 18: Azure Auto Scaling and Load Balancing ───────────────
    private val azureAutoScalingQuiz = Quiz(
        id = "azure_autoscaling_week21",
        title = "Auto-Scaling & Load Balancing",
        description = "Week 21 – Azure Auto-Scaling, VM Scale Sets & Load Balancers",
        subject = "CS6006",
        questions = listOf(
            Question(
                id = 1,
                questionText = "What is Auto-Scaling in cloud systems?",
                options = listOf(
                    "Manually adding servers when traffic increases",
                    "A process of dynamically allocating resources to match performance requirements",
                    "Automatically deleting unused resources every month",
                    "A fixed allocation of resources regardless of demand"
                ),
                correctAnswerIndex = 1,
                explanation = "Auto-scaling is the process of dynamically allocating resources to match performance requirements — scaling up when demand increases and scaling down when demand slackens to reduce costs."
            ),
            Question(
                id = 2,
                questionText = "What are the two main reasons for auto-scaling?",
                options = listOf(
                    "To increase security and improve compliance",
                    "To add resources when demand increases (maintaining SLAs) and remove them when demand slackens (reducing costs)",
                    "To backup data automatically and restore it when needed",
                    "To upgrade software versions and apply patches automatically"
                ),
                correctAnswerIndex = 1,
                explanation = "Auto-scaling serves two purposes: adding resources when demand increases to maintain performance and meet SLAs, and removing resources when demand drops to reduce unnecessary costs."
            ),
            Question(
                id = 3,
                questionText = "What management benefit does auto-scaling provide?",
                options = listOf(
                    "It eliminates the need for any cloud subscription",
                    "It automatically writes application code",
                    "It reduces the need for an operator to continually monitor system performance",
                    "It replaces the need for load balancers"
                ),
                correctAnswerIndex = 2,
                explanation = "Auto-scaling takes advantage of cloud elasticity and reduces management overhead by removing the need for an operator to continually monitor performance and manually adjust resources."
            ),
            Question(
                id = 4,
                questionText = "How do Azure Virtual Machines implement auto-scaling?",
                options = listOf(
                    "Through Azure App Service autoscale settings",
                    "Through Virtual Machine Scale Sets, which manage a set of VMs as a group",
                    "Through Azure Functions automatic compute allocation",
                    "Through manual scaling via the Azure portal"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure Virtual Machines autoscale via Virtual Machine Scale Sets (VMSS), which manage a set of virtual machines as a group, automatically increasing or decreasing the number of instances based on demand."
            ),
            Question(
                id = 5,
                questionText = "How does Azure Functions differ from other compute options regarding auto-scaling?",
                options = listOf(
                    "Azure Functions requires you to manually configure autoscale rules",
                    "Azure Functions cannot auto-scale — it has a fixed compute allocation",
                    "Azure Functions automatically allocates compute power when code is running, scaling out as necessary without any autoscale rule configuration",
                    "Azure Functions only scales based on a time schedule"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Functions differs from other compute options because you don't need to configure any autoscale rules — it automatically allocates compute power when code is running and scales out as needed to handle load."
            ),
            Question(
                id = 6,
                questionText = "What are Azure Virtual Machine Scale Sets?",
                options = listOf(
                    "A tool for monitoring VM performance metrics",
                    "A service that lets you create and manage a group of load-balanced VM instances that can automatically increase or decrease in response to demand",
                    "A type of Azure storage for VM disk images",
                    "A security group for controlling VM network access"
                ),
                correctAnswerIndex = 1,
                explanation = "Azure VM Scale Sets let you create and manage a group of load-balanced VM instances. The number of instances can automatically increase or decrease in response to demand or a defined schedule."
            ),
            Question(
                id = 7,
                questionText = "How do VM Scale Sets provide high availability?",
                options = listOf(
                    "By keeping all VMs in a single datacenter for low latency",
                    "By distributing VMs across availability zones or fault domains",
                    "By running all VMs on the same physical host for consistency",
                    "By storing VM images in geo-redundant storage"
                ),
                correctAnswerIndex = 1,
                explanation = "VM Scale Sets provide high availability and application resiliency by distributing VMs across availability zones or fault domains — protecting against datacenter and hardware failures."
            ),
            Question(
                id = 8,
                questionText = "What is the maximum number of VMs that Flexible orchestration in VM Scale Sets can support for high availability?",
                options = listOf(
                    "Up to 100 VMs",
                    "Up to 500 VMs",
                    "Up to 1,000 VMs",
                    "Up to 10,000 VMs"
                ),
                correctAnswerIndex = 2,
                explanation = "Flexible orchestration in Azure VM Scale Sets provides high availability guarantees for up to 1,000 VMs by spreading them across fault domains in a region or within an Availability Zone."
            ),
            Question(
                id = 9,
                questionText = "Which of the following workloads can benefit from VM Scale Sets with Flexible orchestration?",
                options = listOf(
                    "Only static websites with no dynamic content",
                    "Only batch processing jobs that run once per day",
                    "Quorum-based workloads, open-source databases, stateful applications, and services requiring high availability",
                    "Only IoT device firmware update deployments"
                ),
                correctAnswerIndex = 2,
                explanation = "Flexible orchestration supports workloads including quorum-based workloads, open-source databases, stateful applications, high-availability services, and mixed VM type deployments with Spot and on-demand VMs."
            ),
            Question(
                id = 10,
                questionText = "At which OSI model layer does Azure Load Balancer operate?",
                options = listOf(
                    "Layer 7 — Application layer",
                    "Layer 3 — Network layer",
                    "Layer 4 — Transport layer",
                    "Layer 2 — Data Link layer"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Load Balancer operates at Layer 4 (Transport layer) of the OSI model — it makes routing decisions based on IP address and TCP/UDP port, not on application-level content."
            ),
            Question(
                id = 11,
                questionText = "What is the role of the frontend in an Azure Load Balancer?",
                options = listOf(
                    "It stores the health probe configurations",
                    "It is the single point of contact for clients — receiving inbound traffic and distributing it to backend pool instances",
                    "It monitors backend VM performance metrics",
                    "It manages SSL certificate termination for HTTPS traffic"
                ),
                correctAnswerIndex = 1,
                explanation = "The Load Balancer frontend is the single point of contact for clients. Inbound flows arrive at the frontend IP and are distributed to backend pool instances according to load-balancing rules and health probes."
            ),
            Question(
                id = 12,
                questionText = "What can the backend pool of an Azure Load Balancer consist of?",
                options = listOf(
                    "Only Azure App Service instances",
                    "Only Azure Kubernetes Service pods",
                    "Azure Virtual Machines or Virtual Machine Scale Sets",
                    "Only Azure Functions instances"
                ),
                correctAnswerIndex = 2,
                explanation = "The backend pool of an Azure Load Balancer can consist of Azure Virtual Machines (VMs) or Virtual Machine Scale Sets (VMSS) — the instances that receive and process the distributed traffic."
            ),
            Question(
                id = 13,
                questionText = "What does a Public Load Balancer provide for VMs inside a virtual network?",
                options = listOf(
                    "Only inbound connectivity from the internet",
                    "Both inbound and outbound connectivity — load balancing internet traffic inbound and translating private IPs to public IPs for outbound connections",
                    "Only connectivity within the virtual network",
                    "Only DNS resolution for VM hostnames"
                ),
                correctAnswerIndex = 1,
                explanation = "A public load balancer provides both inbound connectivity (load balancing internet traffic to VMs) and outbound connectivity (translating VMs' private IPs to public IPs for outbound connections)."
            ),
            Question(
                id = 14,
                questionText = "What is an Internal (Private) Load Balancer used for?",
                options = listOf(
                    "Load balancing internet traffic to public-facing web servers",
                    "Translating private IP addresses to public IPs for outbound connections",
                    "Providing inbound connectivity to VMs in private network scenarios, such as hybrid connections from on-premises networks",
                    "Managing SSL certificates for HTTPS traffic"
                ),
                correctAnswerIndex = 2,
                explanation = "An Internal (private) Load Balancer provides inbound connectivity to VMs in private network scenarios — such as accessing a load balancer frontend from an on-premises network in a hybrid setup."
            ),
            Question(
                id = 15,
                questionText = "How does Azure Load Balancer distribute traffic to backend instances?",
                options = listOf(
                    "Randomly without any rules",
                    "Always to the VM with the most available CPU",
                    "According to configured load-balancing rules and health probes",
                    "Based on the geographic location of the client"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure Load Balancer distributes inbound flows to backend pool instances according to configured load-balancing rules and health probes — ensuring traffic only goes to healthy instances."
            ),
            Question(
                id = 16,
                questionText = "What is the best practice for zone-redundancy in Azure Load Balancer?",
                options = listOf(
                    "Deploy the load balancer in a single availability zone for consistency",
                    "Deploy with zone-redundancy — ensuring the load balancer's frontend IP is zone-redundant, protecting the data path from zone failure",
                    "Use a separate load balancer for each availability zone",
                    "Disable zone redundancy to reduce costs"
                ),
                correctAnswerIndex = 1,
                explanation = "Deploying with zone-redundancy provides the best resiliency — the load balancer's availability zone selection is synonymous with its frontend IP's zone selection, protecting against zone failures."
            ),
            Question(
                id = 17,
                questionText = "Why should the backend pool contain at least two VM instances?",
                options = listOf(
                    "Because Azure charges less per VM when you have two or more",
                    "If the backend pool has only one instance and it becomes unhealthy, all traffic fails due to lack of redundancy",
                    "Because load balancing requires an even number of instances",
                    "Because two instances are required to meet GDPR compliance"
                ),
                correctAnswerIndex = 1,
                explanation = "Having at least two backend pool instances ensures redundancy — if there is only one instance and it becomes unhealthy, all traffic fails. The Standard Load Balancer SLA also requires at least two healthy instances."
            ),
            Question(
                id = 18,
                questionText = "What does a Global Load Balancer enable in Azure?",
                options = listOf(
                    "Load balancing within a single Azure region only",
                    "Cross-region load balancing — if one region fails, traffic is routed to the next closest healthy regional load balancer",
                    "Load balancing between on-premises servers only",
                    "Automatic DNS resolution across multiple regions"
                ),
                correctAnswerIndex = 1,
                explanation = "A global load balancer enables cross-region load balancing and regional redundancy — if one region fails, traffic is automatically routed to the next closest healthy regional load balancer."
            ),
            Question(
                id = 19,
                questionText = "How does Azure App Service implement auto-scaling?",
                options = listOf(
                    "Through Virtual Machine Scale Sets configured per app",
                    "Through Azure Functions triggers",
                    "Through built-in autoscaling where autoscale settings apply to all apps within an App Service",
                    "Through manual scaling only via the Azure portal"
                ),
                correctAnswerIndex = 2,
                explanation = "Azure App Service has built-in autoscaling — autoscale settings apply to all of the apps within an App Service plan, scaling the underlying compute resources up or down based on defined rules."
            ),
            Question(
                id = 20,
                questionText = "What is a key advantage of using VM Scale Sets with a mix of Spot and on-demand VMs?",
                options = listOf(
                    "Spot VMs provide guaranteed availability at all times",
                    "It allows cost optimization by using cheaper Spot VMs for non-critical workloads while maintaining on-demand VMs for reliability",
                    "Mixing VM types increases the maximum scale set size to unlimited",
                    "On-demand VMs automatically convert to Spot VMs when demand drops"
                ),
                correctAnswerIndex = 1,
                explanation = "Mixing Spot VMs (lower cost, can be evicted) with on-demand VMs in a Scale Set allows cost optimization — using cheaper Spot VMs where possible while on-demand VMs provide baseline reliability."
            )
        )
    )

    // ── ADD MORE QUIZZES HERE ─────────────────────────────────────────
    // Example:
    // private val networkingQuiz = Quiz(
    //     id = "networking_101",
    //     title = "Computer Networking",
    //     description = "Week 3 – OSI Model and TCP/IP",
    //     subject = "CS6006",
    //     questions = listOf( ... )
    // )

    // ── Master list — add new quizzes here ───────────────────────────
    val allQuizzes: List<Quiz> = listOf(

        distributedSystemsQuiz,
        distributedArchitecturesQuiz,
        cloudComputingQuiz,
        azureCoreServicesQuiz,
        vmsAndContainersQuiz,
        azureNetworkingQuiz,
        azureStorageQuiz,
        azureIoTQuiz,
        azureIoTServicesQuiz,
        azureStreamAnalyticsQuiz,
        serverlessComputingQuiz,
        cloudIoTSecurityQuiz,
        azureIoTEdgeQuiz,
        azureGovernanceQuiz,
        azureBigDataQuiz,
        devOpsQuiz,
        azureAutoScalingQuiz,
        test1Quiz
    )

    fun getQuizById(id: String): Quiz? = allQuizzes.find { it.id == id }
}
